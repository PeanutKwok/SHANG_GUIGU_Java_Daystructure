package NowCoder_Offer;
import java.util.Scanner;

public class Replace_Space2 {
    public static void main(String[] args) {
        System.out.println("输入字符串");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = str1.replace(" ", "%20");
        System.out.println(str1);
        System.out.println(str2);
    }
}



    /*public String replaceSpace(StringBuffer str) {
        System.out.println("输入字符串");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = str1.replace(" ","%20");
        //String str3 = str1."%20";
        return StringBuffer str;


}
    public void print()
}
    */