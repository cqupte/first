package homework;

public class Array {
    public static void main(String[] args) {
        int[] dahf = {2, 1, 4, 3, 5, 6};
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(dahf[j]);
                if (dahf[j] > dahf[j + 1]) {
                    int temp = dahf[j];
                    dahf[j] = dahf[j + 1];
                    dahf[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(dahf[i]);
        }

    }
}
