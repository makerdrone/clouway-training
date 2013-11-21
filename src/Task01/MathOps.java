package Task01;


public class MathOps {

    public MathOps(){
    }

    /**
     * Calculates the greatest common divisor of two numbers
     * @param a the first number
     * @param b the second number
     * @return the GCD of the specified numbers
     */
    public static int gcd(int a, int b){
        if(a == 0)
            return b;

        if(b == 0 || b == a)
            return a;

         while(a != b){
             if(a < b)
                 b -= a;

             else if(b < a)
                 a -= b;
         }

        return a;
    }

    /**
     * Calculates the least common multiple of two numbers
     * @param a the first number
     * @param b the second number
     * @return the LCM of the specified numbers
     */
    public static int lcm(int a, int b){
        return Math.abs(a * b) / gcd(a, b);
    }
}
