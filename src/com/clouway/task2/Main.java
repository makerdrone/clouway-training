package com.clouway.task2;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Stefan.Dimitrov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Runing Sumator.");
        runSumator();

        System.out.println("\nRuning heterogen tree.");
        runHeterogenTree();
    }

    public static void runSumator(){

        Sumator sumator = new Sumator();
        int a, b;
        double c, d;
        BigInteger e, f;
        BigDecimal g, h;
        String strA, strB;

        a = 5;
        b = 3;
        c = 2.5;
        d = 4.1;
        e = new BigInteger("34000");
        f = new BigInteger("100430");
        g = new BigDecimal("4500.7600981");
        h = new BigDecimal("34.0022003");
        strA = "abc";
        strB = "EFGH";

        System.out.printf("Sum of Integers %d and %d: %d\n", a, b, sumator.sum(a, b));
        System.out.printf("Sum of Doubles %.2f and %.2f: %.2f\n", c, d, sumator.sum(c, d));
        System.out.printf("Sum of BigIntegers %s and %s: %s\n", e.toString(), f.toString(), sumator.sum(e, f).toString());
        System.out.printf("Sum of BigDecimals %s and %s: %s\n", g.toString(), h.toString(), sumator.sum(g, h).toString());
        System.out.printf("Sum of Strings '%s' and '%s': '%s'\n", strA, strB, sumator.sum(strA, strB));
    }

    public static void runHeterogenTree(){
        HeterogenTree tree = new HeterogenTree("root");
        tree.add(new Integer(2));
        tree.add(new Integer(3));
        tree.add(new Double(3.5));
        tree.add(new Integer(5));

        tree.printElements();
        System.out.printf("\nhas element 3.5: %s\n", tree.hasElement(new Double(3.5)));
    }
}
