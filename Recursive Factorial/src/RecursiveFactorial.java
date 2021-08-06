/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - August - 06
 */

public class RecursiveFactorial {
    public static void main(String[] args) {
        RecursiveFactorial recursive = new RecursiveFactorial();
        System.out.println(recursive.factorial(20));
    }

    public long factorial(long fact){
        if (fact > 1){
            return fact * factorial(fact - 1);
        } else {
            return 1;
        }
    }
}
