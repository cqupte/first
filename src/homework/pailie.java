package homework;

public class pailie {
    public static void main(String[] args) {
        int[] arange = {5, 3, 2, 1, 6, 9, 8, 4};
        for (int i = 1; i < arange.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arange[j] < arange[j - 1]) {
                    int temp = arange[j - 1];
                    arange[j - 1] = arange[j];
                    arange[j] = temp;
                }
            }
            for (int k = 0; k < arange.length; k++) {
                System.out.print(arange[k]);
            }
            System.out.println();
        }
        for (int i = 0; i < arange.length; i++) {
            System.out.print(arange[i]);
        }
    }
}

