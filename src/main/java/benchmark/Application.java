package benchmark;

import java.util.concurrent.TimeUnit;

/**
 * @author Abdur Rahim Nishad
 * @since 1.0.0
 */
public class Application {
    public static void main(String[] args) {
        int n = 43;

        System.out.println("Fibonacci iteration:");

        long start = System.nanoTime();

        int fibN = fib(n);
        System.out.printf("result = %d is: %d \n", n, fibN);

        long elapsedTime = System.nanoTime() - start;

        double seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double secondDecimalPrecision = (double)elapsedTime / 1000000000.0;
        double ms = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double minutes = TimeUnit.MINUTES.convert(elapsedTime, TimeUnit.NANOSECONDS);

        System.out.printf("Nanoseconds: %d ms\n", elapsedTime );
        System.out.printf("Miliseconds: %f ms\n", ms );
        System.out.printf("Seconds: %f ms\n", seconds);
        System.out.printf("Seconds2: %f ms\n", secondDecimalPrecision);
        System.out.printf("MInutes: %f ms\n", minutes);

    }
    static int fib(int n) {
        if (n<2) return 1;
        else return fib(n-1) + fib(n-2);
    }
}
