package ezhan.rong;

import java.util.Scanner;

public class Hellowrold {
    public static void main(String[] args) {
        int a;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for (int i = 1; i <= a; i++)                     //i控制行数
        {
            if (i <= (a + 1) / 2)                            //前一半加以的程序
            {
                for (int j = 0; j < (a + 1) / 2 - i; j++) //不理解j < (a+1)/2 - i为什么就能正常运行
                {
                    System.out.print(" ");           //控制空格
                }
                System.out.print("*");               //打出坐上部分的*
                if (i > 1)                           //保证第一行只有一个*
                {
                    for (int k = 0; k < 2 * i - 3; k++) {
                        System.out.print(" ");       //控制两个*之间的空格数
                    }
                    System.out.print("*");          //打印第二个*
                }
                System.out.println("");             //换行
            } else {
                for (int m = 0; m < i - (a + 1) / 2; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i < a) {
                    for (int n = 0; n < (2 * a - 1) - 2 * i; n++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println("");
            }
        }


    }
}

