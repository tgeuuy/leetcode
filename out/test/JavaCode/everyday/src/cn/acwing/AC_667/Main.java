package cn.acwing.AC_667;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 16:59
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        if (s < e) System.out.printf("O JOGO DUROU %d HORA(S)", e - s);
        else if (s == e) System.out.printf("O JOGO DUROU %d HORA(S)", 24);
        else System.out.printf("O JOGO DUROU %d HORA(S)", (24 - s + e) % 24);
    }
}
