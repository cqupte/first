package homework;

public class Yiweishuzu {
    public static void main(String[] args) {
        int[] score = {1, 2, 8, 51, 48, 64, 54, 44, 24, 154};
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
