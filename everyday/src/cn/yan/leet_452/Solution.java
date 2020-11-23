package cn.yan.leet_452;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        List<int[]> list = Arrays.stream(points).sorted((s1, s2) -> {
            //按照数组的第一个数start进行升序排序
            return s1[0] - s2[0];
        }).collect(Collectors.toList());
        //集合的左区间
        int left = list.get(0)[0];
        //集合的右区间
        int right = list.get(0)[1];
        //代表箭的数量
        int num = 0;
        for(int i = 1;i<list.size();i++){
            if(list.get(i)[0] <= right && list.get(i)[1] >= left){
                left = Math.max(left,list.get(i)[0]);
                right = Math.min(right, list.get(i)[1]);
            }else{
                num++;
                left = list.get(i)[0];
                right = list.get(i)[1];
            }
        }
        return num+1;


    }

    @Test
    public void practice() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int res = findMinArrowShots(points);
        System.out.println(res);
    }
}
