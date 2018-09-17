public class FactorialRecursive implements Factorial{

    int fact = 1;
    @Override
    public int factorial(int n) {

        if(n==0)
            return fact;
        else if(n>0){
            return n * factorial(n-1);
        }
        return 0;
    }
}
