package homework;//制作一个判断用户生肖的程序年份在年以后

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a;
        int cycleTime = 12;
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        switch (a = year % cycleTime) {
            case 0: {
                System.out.println("是猴年");
                break;
            }
            case 1: {
                System.out.println("是鸡年");
                break;
            }
            case 2: {
                System.out.println("是狗年");
                break;
            }
            case 3: {
                System.out.println("是猪年");
                break;
            }
            case 4: {
                System.out.println("是鼠年");
                break;
            }
            case 5: {
                System.out.println("是牛年");
                break;
            }
            case 6: {
                System.out.println("是虎年");
                break;
            }
            case 7: {
                System.out.println("是兔年");
                break;
            }
            case 8: {
                System.out.println("是龙年");
                break;
            }
            case 9: {
                System.out.println("是蛇年");
                break;
            }
            case 10: {
                System.out.println("是马年");
                break;
            }
            case 11: {
                System.out.println("是羊年");
                break;
            }
        }
    }
}
