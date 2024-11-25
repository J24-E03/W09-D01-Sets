package org.dcistudent.models.election;

import lombok.*;

@Getter @Setter
public class Ballot {
    private String name;
    private Boolean voted = false;
    private Boolean crosses = false;

    public Ballot(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Ballot{" +
                "name='" + name + '\'' +
                ", voted=" + voted +
                ", crosses=" + crosses +
                '}';
    }
}
