package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    //using Recursion

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        } else return (N * factorial(N - 1));
    }


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //using Iteration

        int a = 5;
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println("factorial of 5 is: " + result);

        System.out.println(factorial(5));

    }
}



