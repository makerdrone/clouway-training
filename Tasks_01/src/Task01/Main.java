package Task01;


public class Main {

    public static void main(String[] args){

        Maths mathop = new Maths();

        // Running GCD
        System.out.println(mathop.gcd(45, 25));

        // Running LCM
        System.out.println(mathop.lcm(45, 25));
    }
}