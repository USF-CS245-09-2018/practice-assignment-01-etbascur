public class FibonacciRecursive  implements Fibonacci{
    @Override
    public int fibonacci(int n) {
        if(n==0 || n ==1)
            return n;
        else if (n>1)
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
        return 0;
    }
}
