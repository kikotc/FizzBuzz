package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int multiples = 0;
        int i = 1;
        while (i < n) {
                if (i % a == 0 || i % b == 0) {
                    multiples++;
                }
            i++;
        }
        return multiples;
    }

    public static int multiples() {
        return Multiples.multiples(1000, 3, 5);
    }
}
