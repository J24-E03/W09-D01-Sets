public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
         this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.id,this.id);
    }

    public String toString(){
        return "name: " + name + ", id: " + id;
    }
}
