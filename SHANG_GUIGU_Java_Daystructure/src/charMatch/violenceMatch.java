package charMatch;

/*
假设str1匹配到i位置，str2匹配到j位置
1.如果当前字符串匹配成功，str1[i]==str[j],则i++,j++,继续匹配下一个字符
2.如果失配,str1[i]==str[j],令i = i- ( j - 1)
str1[]= {ABCD EFG}  str2[] = {ABCD} 匹配失败后，从str2从B开始与str1进行匹配
每次匹配失败时，i回溯，j被置为0


 */

public class violenceMatch {
    public static void main(String[] args) {
        String str1 = "硅硅谷 尚硅谷你尚硅 尚硅谷你尚硅谷你尚硅你好";
        String str2 = "尚硅谷你尚硅你";
        int index = violenceMatch(str1,str2);//赋值调用
        System.out.println("index" +index);

    }


    public static int violenceMatch(String str1,String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1Len = s1.length;
        int s2Len = s2.length;

        int i = 0;//i索引指向s1
        int j = 0;//j索引指向s2
        while(i < s1Len && j < s2Len){//保证匹配时，不越界

            if(s1[i] ==s2[j]){//匹配成功
                i++;
                j++;
            }else{//没有匹配成功
                //如果失配,str1[i]==str[j],令i = i- (j - 1),j = 0
                i = i -(j - 1);
                j = 0;
            }
        }
        //判断是否匹配成功
        if(j == s2Len){//匹配成功，j长度为s2字符串的长度？
            return i - j;//匹配到str1[i] str2[j]停下来 那么索引到的位置i-j
        }else {
            return -1;
        }
    }
}
