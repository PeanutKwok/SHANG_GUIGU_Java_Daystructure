package demo02;

public class Student {
    private int id;//学号
    private String name;//
    private int age;
    static String room;
    //学号计数器，每当new一个新对象的时候，计数器++
    private static int idCounter = 0;

    public Student() {
        this.id = ++ idCounter;//
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++ idCounter;//
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}