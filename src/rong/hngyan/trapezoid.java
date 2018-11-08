package rong.hngyan;

import java.util.Scanner;

//输入上底,下底,高。打印对应等腰梯形
public class trapezoid {
    public static void main(String[] args) {
        int up, high, down;
        Scanner in = new Scanner(System.in);
        up = in.nextInt();
        high = in.nextInt();
        down = in.nextInt();    //上底 高 下底
        if (up < down) {
            int differentValue = ((down - up) / (high - 1)) / 2;   //每行的差值
            for (int i = 1; i <= high; i++) {
                for (int j = 0; j < differentValue * (high - i); j++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < up + ((i - 1) * differentValue * 2); a++) {
                    System.out.print("*");
                }

                System.out.println("");
            }

        }
    }
}
