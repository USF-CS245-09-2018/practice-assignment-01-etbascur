public class FibonacciIterative implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int sum =1;
        if (n ==0 || n==1)
            return 1;
        for (int i=0; i < n; i++)
        {
            a = b;
            b = sum;
            sum = a + b;
        }
        return a;
    }
}
