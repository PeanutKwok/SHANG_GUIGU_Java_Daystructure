package demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "练习时长2年半的个人练习生蔡徐坤";
        person.setAge(-20);
        person.show();
        //person.setAge(2);
        //person.show();

    }
}
