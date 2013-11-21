package Task01;


public class Maths{

    public Maths(){
    }

    /**
     * Calculates the greatest common divisor of two numbers
     * @param a the first number
     * @param b the second number
     * @return the GCD of the specified numbers
     */
    public static int gcd(int a, int b){
        //if(a == 0 || a == b)
         while(a != b){
             if(a < b)
                 b -= a;

             else if(b < a)
                 a -= b;

             else break;
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
        return (a * b) / gcd(a, b);
    }
}
