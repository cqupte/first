package practice;

import java.util.Scanner;        //为什么要放在最外面

public class Arraytwo {
    public static void main(String[] args) {
        int score[] = {59, 89, 64, 67, 54, 45};
        int age[] = {64, 94, 69, 31, 74, 62};
        java.util.Arrays.sort(score);
        print(score);
        System.out.println("\n");         //数组可以加入用户输入的部分吗
        java.util.Arrays.sort(age);        //返回值是什么有什么作用
        print(age);
    }

    public static void print(int one[]) {
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + "\t");
        }
    }
}
