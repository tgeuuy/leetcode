package cn.yan.leet_452;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int findMinArrowShots(int[][] points) {
        if (points.length==0) return 0;
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minres;
//        for (int i = 0; i < points.length; i++) {
//            if (points[i][0] < min) min = points[i][0];
//            if (points[i][1] > max) max = points[i][1];
//        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) return o1[0] - o2[0];
                else return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            System.out.println(balloon);
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;


    }

    @Test
    public void practice() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int res = findMinArrowShots(points);
        System.out.println(res);
    }
}
