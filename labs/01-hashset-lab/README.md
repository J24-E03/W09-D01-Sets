# HashSet Exercises1_2_3 for Career Development

HashSets are a crucial part of any developer's toolkit, particularly for scenarios that involve unique elements, membership checking, and operations on sets. Below are some meaningful exercises that cover both basic and advanced uses of **HashSets** to help students prepare for real-world applications.

---

## 1. Basic HashSet Operations: Adding, Checking, and Removing Elements
**Objective**: Understand basic HashSet operations such as adding, checking for presence, and removing elements.

**Exercise**:
- Create a `HashSet` to store a collection of unique employee IDs (integers).
- Implement the following operations:
  - Add employee IDs to the set.
  - Check if a given employee ID exists in the set.
  - Remove an employee ID from the set.
  - Display all employee IDs in the set.

**Skills Learned**: Basic set operations, ensuring uniqueness of elements, set membership checking.

---

## 2. Remove Duplicates from a List
**Objective**: Demonstrate HashSet’s ability to remove duplicates by leveraging the fact that sets only store unique values.

**Exercise**:
- Given a list of integers (with possible duplicates), create a `HashSet` to remove duplicate elements.
- Convert the `HashSet` back into a list and print the resulting list of unique integers.

**Skills Learned**: Eliminating duplicates, converting between collections, using HashSet for data cleaning.

---

## 3. Union, Intersection, and Difference of Sets
**Objective**: Understand and implement set operations like union, intersection, and difference using `HashSet`.

**Exercise**:
- Create two `HashSet` instances: one to store the skills of "Developer A" and the other for "Developer B".
- Implement the following set operations:
  - **Union**: Find the combined skills of both developers.
  - **Intersection**: Find the common skills between the two developers.
  - **Difference**: Find the skills that are unique to "Developer A" (i.e., not in "Developer B").

**Skills Learned**: Set theory operations (union, intersection, difference), practical application in comparing collections.

---

## 4. Set Membership in a Student Registration System
**Objective**: Use `HashSet` for membership checking in a real-world scenario like student registration.

**Exercise**:
- Implement a student registration system where each student has a unique ID.
- Use a `HashSet` to store registered student IDs.
- Implement the following functionality:
  - Register a new student (only if their ID isn’t already registered).
  - Check if a student with a given ID is already registered.
  - Display all registered students.

**Skills Learned**: Managing unique IDs, performing membership checks, ensuring uniqueness in real-world scenarios.

---

## 5. Tracking Attendance in a Class
**Objective**: Simulate attendance tracking using a `HashSet`.

**Exercise**:
- Create a `HashSet` to store the student IDs of those who have attended a class.
- Implement the following functionality:
  - Mark a student as attended (add their ID to the `HashSet`).
  - Check if a specific student has attended the class.
  - Display the list of all students who attended the class.

**Skills Learned**: Using `HashSet` to manage attendance, checking membership, storing unique elements.

---

## 6. Find the First Non-Repeated Character in a String
**Objective**: Use a `HashSet` to find the first non-repeated character in a string.

**Exercise**:
- Given a string, find the first character that appears only once. 
- Use a `HashSet` to store characters as they appear in the string, and a second set to track repeated characters.
- Return the first character that is not in the second set (indicating it hasn’t been repeated).

**Skills Learned**: String manipulation, using HashSet for efficient membership checking, identifying unique elements in a stream of data.

---

## 7. Comparing Two Lists for Uniqueness
**Objective**: Use a `HashSet` to compare two lists of items and identify the unique items in each.

**Exercise**:
- Given two lists of products (which may contain duplicates), use a `HashSet` to:
  - Find all unique products that exist in either of the lists (union).
  - Find products that exist in both lists (intersection).
  - Find products that exist only in the first list (difference).

**Skills Learned**: Advanced set operations, comparing collections, handling unique data efficiently.

---

## 8. Set-Based Voting System
**Objective**: Simulate a voting system where each person can vote only once.

**Exercise**:
- Implement a simple voting system using a `HashSet` to store the names of people who have voted.
- Implement the following methods:
  - `vote(String name)`: Adds a voter to the `HashSet` if they haven't voted already.
  - `hasVoted(String name)`: Checks if a person has already voted.
  - `totalVotes()`: Returns the total number of votes cast.

**Skills Learned**: Preventing duplicates, checking membership, using `HashSet` for real-time systems.

---