package homework;

import java.util.Scanner;

public class lingxing {
    public static void main(String[] args) {
        lingxing();
    }

    public static void lingxing() {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入行数：");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {            //控制行数
            for (int j = 0; j < size + 2; j++) {
                if (i <= size / 2) {
                    if (j == (size / 2) + i || j == (size / 2) - i) {
                        System.out.print("*");

                    } else
                        System.out.print(" ");
                } else {
                    if (j == (size / 2) + (size - 1 - i) || j == (size / 2) - (size - 1 - i)) {
                        System.out.print("*");

                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
