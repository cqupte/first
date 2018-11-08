package other;

import java.util.Scanner;

public class Gift {
    public static void main(String[] args) {
        //  int putIn;
        //   Scanner input = new Scanner(System.in);
        //   putIn = input.nextInt();
        for (int i = 1; i <= 11; i++) {
            if (i < 3) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print("  ");
                }
                for (int a = 0; a < 3 * i - 1; a++) {
                    System.out.print("**");
                }
                for (int b = 0; b < 9-4*i; b++) {
                    System.out.print("  ");
                }
                for (int c = 0; c < 3 * i - 1; c++) {
                    System.out.print("**");
                }
            }

            if (i == 3) {
                System.out.print("  ");
                for (int d = 0; d < 13; d++) {
                    System.out.print("**");
                }
            }

            if (i > 3 && i < 6) {
                for (int e = 0; e < 15; e++) {
                    System.out.print("**");
                }
            }

            if (i > 5 && i < 8) {
                System.out.print("  ");
                for (int f = 0; f < 13; f++) {
                    System.out.print("**");
                }
            }

            if (i ==8) {
                for (int g = 0; g < 2 * i - 14; g++) {
                    System.out.print("  ");
                }
                for (int h = 0; h < 11; h++) {
                    System.out.print("**");
                }
            }
            if(i>8){
                for (int y = 0; y < 3*i-19; y++) {
                    System.out.print(" ");
                }
                for (int x = 0; x < 34-3*i; x++) {
                    System.out.print("**");
                }
            }
            System.out.println("");
        }
    }

}

