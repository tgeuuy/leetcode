package cn.acwing.array;

import java.util.Scanner;

public class AC_785 {

    public static final int MAX = 100006;

/*    public static void main(String[] args) {

        int[] arr = new int[MAX];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/
    public static void main(String[] args) {

        int[] arr=new int[]{1,223,43,5,7};

        quicksort(arr, 0, 5 - 1);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void quicksort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int mid = (l + r) >> 1;
        while (i < j) {
            do i++; while (arr[mid] > arr[i]);
            do j--; while (arr[mid] < arr[j]);
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        quicksort(arr,l,j);
        quicksort(arr,j+1,r);


    }
}
