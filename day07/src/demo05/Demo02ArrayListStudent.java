package demo05;

/*
集合当中存储自定义的类型对象
题目：
自定义4个学生对象，添加到集合，并遍历

思路:
1.自定义Student学生类，四个部分 无参 全参 Getter Setter方法
2.创建一个集合，用来存储学生对象。泛型:<Student>
3.根据类，创建4个学生对象
4.将4个学生对象添加到集合当中:add
5.遍历集合：for、size、get
 */

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("切尔西",100);
        Student two = new Student("巴塞罗那",99);
        Student three = new Student("曼联",105);
        Student four = new Student("尤文图斯",112);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //list.fori

        for (int i = 0; i < list.size(); i++) {
            Student stu =list.get(i);
            System.out.println("姓名: " + stu.getName() + "年龄: " + stu.getAge());

        }
    }
}

