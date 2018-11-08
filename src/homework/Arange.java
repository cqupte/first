package homework;

public class Arange {
    public static void main(String[] args) {
        int[] Eight = {5, 3, 2, 1, 6, 9, 8, 4};
        for (int i = 1; i <= (Eight.length - 1); i++) {    //进行几轮比较   i该次是第几次循环
            // 为什么i小于和小于等于都可以
            for (int j = 0; j < (Eight.length - i); j++) {//j每轮进行几次
                if (Eight[j] > Eight[j + 1]) {              //冒泡循环判断相邻两个数的大小
                    int a = Eight[j];                       //进行交换
                    Eight[j] = Eight[j + 1];
                    Eight[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < Eight.length; i++) {
            System.out.print(Eight[i]);
        }

    }
}                                          /* O（n*n） 用时（n*(n-1)/2）*2/2
最好情况 按顺序排列
时间  n-1
最坏 按倒序排列
时间  （n*(n-1)/2）*2
*/