package practice;

public class Arrayone {
    public static void main(String[] args) {
        int one = addOne(10, 20);
        float two = addTwo(10.3f, 13.3f);
        System.out.println(one);
        System.out.println(two);
    }

    public static int addOne(int a, int b) {
        int i = 0;
        i = a + b;
        return i;
    }

    public static float addTwo(float a, float b) {
        float i = 0;
        i = a + b;
        return i;
    }
}
