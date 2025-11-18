package Recursion;

public class ep3 {
    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }

    static void countEvenOdd(int range, int countOdd, int countEven) {
        if (range == 0)
            System.out.println("even count " + countEven + " oddcount" + countOdd);

        if (range % 2 == 0) countEven++;
        else countOdd++;
        countEvenOdd(range - 1, countOdd, countEven);
        ;
    }
}
