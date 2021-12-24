package cn.acwing.AC_75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author tgeuuy
 * @Date 2021/11/14 11:03
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 0, 9, 8, 5, 0, 0, 7, 0};
        int[] res = findNumbersWithSum(nums, 17);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findNumbersWithSum(int[] nums, int target) {
        if (nums.length < 2) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i]))
                return new int[]{nums[i], target - nums[i]};
        }
        return null;
    }

}
