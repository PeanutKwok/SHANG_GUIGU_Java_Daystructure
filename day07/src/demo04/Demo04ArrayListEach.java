package demo04;


import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("曼联");
        list.add("切尔西");
        list.add("利物浦");

        //遍历集合



        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));

        }


    }
}
