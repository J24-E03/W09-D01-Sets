# LinkedHashSet Exercises

`LinkedHashSet` is a subclass of `HashSet` that maintains the order in which elements were inserted. This is useful when you need the uniqueness of a set but also want to preserve the order of insertion. Here are a few exercises designed to help students understand and apply `LinkedHashSet`.

---

## 1. Preserve Insertion Order in a List of Customer IDs
**Objective**: Use `LinkedHashSet` to preserve the order of customer IDs while removing duplicates.

**Exercise**:
- Create a `LinkedHashSet` to store a list of customer IDs (integers).
- The list may contain duplicate customer IDs. Add each ID to the `LinkedHashSet`.
- After adding the IDs, print the `LinkedHashSet` to verify:
  - Duplicate customer IDs are removed.
  - The order in which IDs were added is preserved.
  
**Example**:
```text
Customer IDs: [101, 102, 103, 101, 104, 102]
Final LinkedHashSet: [101, 102, 103, 104]
```


## 2. Managing Unique Log Entries with Timestamps
**Objective**: Use `LinkedHashSet` to store log entries while maintaining the order of entries.

**Exercise**:
- Create a `LinkedHashSet` to store log entries represented by a `String` (e.g., log messages).
- Each log entry should include a timestamp and a log message (e.g., `"2024-11-17 10:00:00: User logged in"`).
- Add multiple log entries, some of which may be duplicates (e.g., the same log message at different times).
- Print the final set of logs:
  - Ensure duplicate log entries are removed.
  - Ensure the order of logs is preserved.

**Example**:
```text
Log Entries: 
2024-11-17 10:00:00: User logged in
2024-11-17 10:05:00: User updated profile
2024-11-17 10:00:00: User logged in
2024-11-17 10:10:00: User logged out

Final LinkedHashSet:
2024-11-17 10:00:00: User logged in
2024-11-17 10:05:00: User updated profile
2024-11-17 10:10:00: User logged out
```

## 3. Implementing a Unique Order of Products in an E-Commerce System
**Objective**: Use `LinkedHashSet` to track products added to a shopping cart, ensuring unique products while preserving the order they were added.

**Exercise**:
- Create a `LinkedHashSet` to store product names in a shopping cart.
- Add multiple products to the shopping cart, including duplicates (e.g., the same product being added multiple times).
- After adding products, print the shopping cart to verify that:
  - No duplicate products are present.
  - The order of products reflects the sequence they were added.

**Example**:
```text
Products Added:
"Product 1", "Product 2", "Product 3", "Product 1", "Product 4", "Product 2"

Final Shopping Cart (LinkedHashSet):
["Product 1", "Product 2", "Product 3", "Product 4"]
```

## 4. Merging Two Lists and Removing Duplicates While Preserving Order
**Objective**: Use `LinkedHashSet` to merge two `ArrayList`s, remove duplicates, and preserve the original insertion order.

**Exercise**:
- Given two `ArrayList`s of strings, first merge the two lists into a single list.
- Use a `LinkedHashSet` to remove duplicates while keeping the order of the elements as they appear in the original lists.
- Convert the `LinkedHashSet` back into an `ArrayList` and print the final list.

**Example**:
```java
// ArrayLists with duplicates
ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Apple"));
ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Date", "Cherry", "Elderberry"));

// Merging lists
list1.addAll(list2);

// Convert to LinkedHashSet to remove duplicates and maintain order
LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(list1);

// Convert back to ArrayList
ArrayList<String> finalList = new ArrayList<>(uniqueSet);

// Final list after merging and removing duplicates
System.out.println(finalList);
