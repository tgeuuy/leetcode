package cn.acwing.AC_75;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author tgeuuy
 * @Date 2021/11/14 11:03
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int sum = 7;
        int[] res = findNumbersWithSum(nums, sum);
        System.out.println(Arrays.toString(res));

    }


    public static int[] findNumbersWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[]{nums[i], val};
            } else {
                map.put(nums[i], i);
            }

        }
        return null;

    }
}
