package cn.acwing.AC_745;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/11/11 10:59
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {


        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        Float[][] num = new Float[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = i; j < 12; j++) {
                num[i][j] = sc.nextFloat();
            }
        }

        float sum = 0;
        float c = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = i+1; j < 12; j++) {
                sum += num[i][j];
                c++;
            }
        }

        System.out.println(decimalFormat.format(ch.equals("S") ? sum : sum / c));


    }
}