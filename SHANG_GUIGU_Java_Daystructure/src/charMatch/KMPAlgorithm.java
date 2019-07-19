package charMatch;

import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "BB";

        int[] next = kmpNext("AAAB");
        System.out.println("next=" + Arrays.toString(next));

        int index = kmpSearch(str1, str2, next);
        System.out.println("index=" + index);


    }

    //str1源字符串
    // str2字串
    // next 部分匹配表,是子串对应的部分匹配表
    //如果是-1就是没有匹配到，否则返回第一个匹配的位置
    public static int kmpSearch(String str1, String str2, int[] next) {

        //遍历
        for (int i = 0, j = 0; i < str1.length(); i++) {
            //需要处理str.1charAt(i) !=str2.charAt(j) 取调整j的大小
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j =next[j-1];
            }


            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {//找到了
                return i - j + 1;
            }
        }

        return -1;

    }

    //获取到一个字符串（字串）部分匹配表
    public static int[] kmpNext(String dest) {
        //创建一个next数组，保存数组的部分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0;//如果字符串长度为1，部分匹配值为0
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];

            }
            //当dest.charAt(i)==dest.charAt(j)满足时,部分匹配值就是+1
            //当dest.charAt(i)!=dest.charAt(j)时,我们需要从next[j-1]获取新的j
            //直到我们发现有dest.charAt(i)==dest.charAt(j)满足时，才退出

            //这是kmp算法的核心点

            if (dest.charAt(i) == dest.charAt(j)) {//charAt(i)用于返回索引i处的字符


                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
