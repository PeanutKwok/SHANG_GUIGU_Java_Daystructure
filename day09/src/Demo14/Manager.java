package Demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看下群主有多少钱
        int leftMoney = super.getMoney();//群主当前余额
        if(totalMoney>leftMoney){
            System.out.println("余额不足");

            return redList;//返回空集合
        }
        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，也就是去掉的零头
        //除不开的零头包在最后一个红包中
        //下面把红包一个一个放到集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }

}
