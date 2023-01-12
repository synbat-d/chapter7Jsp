package foo;

public class Counter {
    private static int count;

    public static synchronized int getCount() {
        count=count+2;
        return count;
    }
}
