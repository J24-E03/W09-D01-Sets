package org.dcistudent.service.election;

import lombok.*;
import org.dcistudent.models.election.Ballot;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter
public class Voting {
    private Set<Ballot> voters = new HashSet<>();

    public Ballot registerVoter(String name) {
        try {
            return this.findBallotByName(name);
        } catch (RuntimeException e) {
            Ballot ballot = new Ballot(name);
            this.getVoters().add(ballot);

            return ballot;
        }
    }

    public boolean vote(Ballot ballot, String crosses) {
        if (crosses.isBlank()) {
            return false;
        }

        try {
            ballot = this.findBallot(ballot);
            ballot.setVoted(true);
            ballot.setCrosses(true);

            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public boolean hasVoted(Ballot ballot) {
        try {
            ballot = this.findBallot(ballot);

            return ballot.getVoted() && ballot.getCrosses();
        } catch (RuntimeException e) {
            return false;
        }
    }

    public Ballot findBallotByName(String name) {
        return this
                .getVoters()
                .stream()
                .filter(b -> b.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Voter not found. (findBallotByName)"))
        ;
    }

    public Ballot findBallot(Ballot ballot) {
        return this
                .getVoters()
                .stream()
                .filter(b -> b.getName().equals(ballot.getName()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Voter not found. (findBallot)"))
        ;
    }

    public Integer totalVotes() {
        return this.getVoters().size();
    }
}
