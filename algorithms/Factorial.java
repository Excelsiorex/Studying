package algorithms;


class Factorial {
    static int getSimpleFactorial(int n) {
        if (n == 1) return 1;

        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int getRecursiveFactorial(int n) {
        if (n == 1) return 1;

        return getRecursiveFactorial(n - 1) * n;
    }
}
