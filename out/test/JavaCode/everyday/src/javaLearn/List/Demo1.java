package javaLearn.List;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        // 线程安全的
        List<Integer> list3 = new Stack<>();


        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new PriorityQueue<>();
        Queue<Integer> q3 = new ArrayDeque<>();


        Map<Integer, Integer> m1 = new HashMap();
        Map<Integer, Integer> m2 = new TreeMap<>();

        Set<Integer> set = new HashSet<>();
        Set<Integer> S2 = new TreeSet<>();


    }
}
