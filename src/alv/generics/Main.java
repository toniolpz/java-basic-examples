package alv.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] iArray = { 1, 2, 3, 4, 5, 6 };
        Character[] cArray = { 'a', 'b', 'c', 'd' };

        printMe(iArray);
        printMe(cArray);

        System.out.println(max(15, 40, 52));
        System.out.println(max("apples", "tots", "chiken"));
    }

    // Geric Method
    private static <T> void printMe(T[] i) {
        for (T x : i)
            System.out.printf("%s ", x);

        System.out.println();
    }

    // Method returning generics
    private static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;
        if (b.compareTo(a) > 0)
            m = b;

        if (c.compareTo(m) > 0)
            m = c;

        return m;
    }
}