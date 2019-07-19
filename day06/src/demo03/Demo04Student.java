package demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("蔡徐坤");
        stu.setAge(2);
        stu.setMale(false);

        System.out.println("姓名:"+ stu.getName());
        System.out.println("年龄:"+ stu.getAge());
        System.out.println("是爷们吗？"+stu.isMale());
    }
}

