package ezhan.rong;

public class Charu {
    public static void main(String[] args) {
        int[] Group = {5, 3, 2, 1, 6, 9, 8, 4};
        for (int i = 1; i < Group.length - 1; i++) {
            for (int j = 0; j < Group.length - 1; j++) {
                if (Group[j] < Group[j + 1]) {
                    int a = Group[j];
                    Group[j] = Group[j + 1];
                    Group[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < Group.length; i++) {
            System.out.print(Group[i]);
        }
    }
}