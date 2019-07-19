package demo03;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }

    //对于基本类型中的boolean值，Getter方法携程isXxx的形式，而setXxx规则不变
    public boolean isMale(){
        return male;
    }


    public void setName (String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;

    }
    public int getAge(){
        return age;
    }
}

