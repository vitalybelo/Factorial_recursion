public class Recursion {

    public static long getFactorial(long n) {
        long result = ((n < 0) ? -1 : 1);
        long nn = Math.abs(n);
        for (long i = 2; i <= nn; i++) result *= i;
        return result;
    }

    public static long getFactorialRecursion(long n) {
        if (n < 0 || n == -0)
            return (n >= -1) ? -1 : n * getFactorialRecursion(Math.abs(n + 1)); // сработает только 1 раз
        return (n <= 1) ? 1 : n * getFactorialRecursion(n - 1);              // основная ветка
    }


}
