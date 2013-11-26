package com.clouway.task1;


public class Main {

    public static void main(String[] args){

        Math math = new Math();
        Array array = new Array();

        // Defining basic work parameters
        int a, b, c;
        int [] array01 = {2, 3, 4, -5};
        int [] array02 = {3, 5, 6, 1, 7, 0, 8};

        // Running GCD
        a = 0;
        b = 25;
        c = 7;

        System.out.printf("GCD of %d and %d: %d\n", a, b, math.gcd(a, b));

        // Running LCM
        System.out.printf("LCM of %d and %d: %d\n", a, b, math.lcm(a, b));

        // Running array - print array
        System.out.print("array01 is: ");
        array.printArray(array01);
        System.out.println();

        // Running array - get minimal element
        System.out.printf("Minimal element of array01: %d\n", array.getMinElement(array01));

        // Running array - get sum of elements
        System.out.printf("Sum of elements of array01: %d\n", array.getSum(array01));

        // Running array - quicksort
        System.out.print("array02 is: ");
        array.printArray(array02);
        System.out.println();

        array.qicksort(array02);
        System.out.print("array02 sorted: ");
        array.printArray(array02);
        System.out.println();

        //Running array - reverse
        array.reverseArray(array02);
        System.out.print("array02 reversed: ");
        array.printArray(array02);
        System.out.println();

        //Running random string generator
        System.out.printf("Random string of length %d: %s\n", c, StringGenerator.randString(c));
    }
}