package cn.test;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[10];
        boolean[] mark =new boolean[10];
        String[]  strs = new String[10];
        Character[] chs=new Character[10];
        Double[] d={0.6876};
        Float[] F={0.87f};
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]+ " "+ mark[i]+ " " +strs[i]+" "+ chs[i]+ " aaaa"+ d[0]+" "+F[0]);
        }
    }
}
