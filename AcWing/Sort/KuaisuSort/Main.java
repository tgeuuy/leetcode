package Sort.KuaisuSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
        quickSort(array, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.println(array[i]);
    }

    public static void quickSort(int[] array, int l, int r) {
        if (l >= r) return;

        int i = l - 1, j = r + 1;
        int q = array[l + r >> 1];
        while (i < j) {
            do i++; while (array[i] < q);
            do j--; while (array[j] > q);
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        quickSort(array, l, j);
        quickSort(array, j + 1, r);
    }
}
