package ezhan.rong;

import java.util.Scanner;

public class shuzau {
    public static void main(String[] args) {
        int b = 0;
        int[] a = {1, 2, 3, 4};
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        switch (size) {
            case 1: {
                for (int i = 0; i < a.length; i++) {
                    b = b + a[i];
                }
                System.out.print(b);
            }
            break;
            case 2: {
                for (int i = 0; i < a.length; i++) {
                    a[i]++;
                }
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]);
                }
            }
            break;
        }
    }
}
