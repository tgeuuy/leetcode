package cn.bit;

import org.junit.Test;

public class leet_645 {

    @Test
    public void test() {
        int[] res = findErrorNums(new int[]{1, 2, 2, 4});
        for (int v : res) {
            System.out.print(v + " ");
        }
    }

    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int n1 = 0, n2 = 0;
        int Xor = 0;
        int len = nums.length;
        for (int i = 1; i <= len; i++) Xor ^= i;
        for (int v : nums) Xor ^= v;

        int lowbit = (Xor) & (-Xor);
        for (int i = 1; i <= len; i++) {
            if ((i & lowbit) == 0) n1 ^= i;
            else n2 ^= i;
        }
        for (int v : nums) {
            if ((v & lowbit) == 0) n1 ^= v;
            else n2 ^= v;
        }

        for (int v : nums) {
            if (v == n1) {
                res[1] = n1;
                res[0] = n2;
            } else {
                res[0] = n1;
                res[1] = n2;
            }
        }

        return res;


    }
}
