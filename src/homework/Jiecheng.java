package homework;

import java.util.Scanner;

public class Jiecheng {
    // a初始  b每一行总和 单个阶乘 c行数 d用户输入的阶乘个数 e所有总和
    //第一个for控制行数 那个while控制每一行
    public static void main(String[] args) {
        int d;
        Scanner input = new Scanner(System.in);
        d = input.nextInt();
        int e = 0;
        for (int c = 1; c <= d; c++) {
            int b = 1;
            for (int a = 1; a <= c; a++) {
                b = a * b;
            }
            e = b + e;
        }
        System.out.println(e);
    }
}