package task_introduction;

public class Mathematical {
    /**
     * Greatest common divisor. Returns the GCD of two numbers.
     * @param a number
     * @param b number
     * @return gcd(a, b)
     */
    public static int gcd(int a, int b){
        if(a == 0 || a == b){
            return b;
        }

        if(b == 0){
            return a;
        }

        while(a != b){
            if(a < b){
                b -= a;
            }
            else if(a > b){
                a -= b;
            }
        }

        return a;
    }

    /**
     * Least common multiple. Returns the LCM of two numbers.
     * @param a number
     * @param b number
     * @return lcm(a, b)
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
