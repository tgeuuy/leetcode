package cn.dp.leet_279;

import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.security.KeyStore;
import java.util.*;

public class Solution {



    @Test
    public void test(){
        System.out.println("res="+ numSquares(91));
    }
    public int numSquares(int n) {
        HashSet<Integer> set = new HashSet<>();
        int[] f = new int[n+1];
        for(int i = 1;i<=n; i ++){
            int minn=Integer.MAX_VALUE;
            for(int j = 1 ; j*j<=i; j++){
//                minn=Math.min(minn,f[i-j*j]);
                if(minn>f[i-j*j]){
                    set.add(j);
                    minn=f[i-j*j];

                }
            }
            f[i]=minn+1;
        }
        Iterator<Integer>  it= set.iterator();
        while (!it.hasNext()){
            Integer entry=it.next();
            System.out.println(entry);

        }
        return f[n];

    }
}
