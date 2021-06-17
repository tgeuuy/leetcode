package cn.algorithm;

import org.junit.Test;

import java.util.Arrays;

public class CuoPai {
    //当前打印的第几个排列
    private int row = 0;
    //存储排列的结果
    private int[][] result;

    public CuoPai(int[] array) {
        this.row = 0;
        this.result = new int[this.factor(array.length)][array.length];
    }

    public int[][] getResult() {
        return result;
    }

    //求数组a的逆序数
    public int against(int a[]) {
        int nn = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    nn++;
                }
            }
        }
        return nn;
    }

    //计算阶乘
    public int factor(int a) {
        int r = 1;
        for (; a >= 1; a--) {
            r *= a;
        }
        return r;
    }


    /**
     * 　打印排列数
     * @param array
     * @param start
     */
    public void perm(int[] array, int start) {
        if (start == array.length) {
            System.out.print((this.row + 1) + ": ");
            for (int i = 0; i < array.length; i++) {
                this.result[row][i] = array[i];
                System.out.print(array[i] + " ");
            }
            this.row++;
            System.out.println("逆序数是：" + this.against(array));
            System.out.print('\n');
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                perm(array, start + 1);
                swap(array, start, i);
            }
        }
    }

    public void swap(int[] array, int s, int i) {
        int t = array[s];
        array[s] = array[i];
        array[i] = t;
    }

    public void printResult() {
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(this.result[i]));
        }
    }

    @Test
    public void test() {
        int[] a = {1, 2, 3};
        CuoPai p = new CuoPai(a);
        p.perm(a, 0);
        p.printResult();
    }
}