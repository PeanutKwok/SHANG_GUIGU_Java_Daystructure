package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] result={-1,-1};
        int[] nums={11,7,9,15};
        int target = 20;
        result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] num ={-1,-1};
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++ ){
                if(target ==nums[i] + nums[j]){
                    num[0] = i;
                    num[1] = j;
                }

                }
            }
        return num;
    }
}
