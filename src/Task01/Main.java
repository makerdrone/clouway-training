package Task01;


public class Main {

    public static void main(String[] args){

        // Defining basic work parameters
        int a, b, c, d, e, f, g;

        // Running GCD
        a = 3;
        b = 25;

        System.out.printf("GCD of %d and %d: %d\n", a, b, Maths.gcd(a, b));

        // Running LCM
        System.out.println(Maths.lcm(a, b));
    }
}