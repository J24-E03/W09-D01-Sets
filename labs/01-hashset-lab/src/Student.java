public class Student {
    private static int USER_ID = 1;

    private final int id;
    private final String name;

    public Student(String name) {
        this.id = USER_ID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
