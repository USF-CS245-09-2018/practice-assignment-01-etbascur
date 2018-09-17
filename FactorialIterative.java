//import edu.usfca.cs.cs245.Factorial;

public class FactorialIterative implements Factorial {
    @Override
    public int factorial(int n) {
        int fact=1;
        while(n>0){
            if (n ==1)
                return fact;
            fact= (fact*n);
            n--;
        }
        return 0;
    }


}
