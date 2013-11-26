package com.clouway.task2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Stefan.Dimitrov
 */
public class Sumator {
    public Sumator(){
    }

    /**
     * Sums two numbers of type int
     * @param a
     * @param b
     * @return sum of a and b
     */
    public int sum(int a, int b){
        return a + b;
    }

    /**
     * Sums two numbers of type double
     * @param a
     * @param b
     * @return sum of a and b
     */
    public double sum(double a, double b){
        return a + b;
    }

    /**
     * Sums two Strings. Result is a concatenated String
     * @param a
     * @param b
     * @return the combined string of a and b
     */
    public String sum(String a, String b){
        return String.format("%s%s", a, b);
    }

    /**
     * Sums two numbers of type BigInteger
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigInteger sum(BigInteger a, BigInteger b){
        BigInteger result = new BigInteger("0");

        result = result.add(a);
        return result.add(b);
    }

    /**
     * Sums two numbers of type BigDecimal
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigDecimal sum(BigDecimal a, BigDecimal b){
        BigDecimal result = new BigDecimal(0);

        result = result.add(a);
        return result.add(b);
    }

    /**
     * Sums two numbers of type BigInteger and int
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigInteger sum(BigInteger a, int b){
        BigInteger result = new BigInteger("0");

        result = result.add(a);
        return result.add(BigInteger.valueOf(b));
    }

    /**
     * Sums two numbers of type int and BigInteger
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigInteger sum(int a, BigInteger b){
        return sum(b, a);
    }

    /**
     * Sums two numbers of type BigDecimal and int
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigDecimal sum(BigDecimal a, int b){
        BigDecimal result = new BigDecimal(0);

        result = result.add(a);
        return result.add(BigDecimal.valueOf(b));
    }

    /**
     * Sums two numbers of type int and BigDecimal
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigDecimal sum(int a, BigDecimal b){
        return sum(b, a);
    }

    /**
     * Sums two numbers of type BigDecimal and double
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigDecimal sum(BigDecimal a, double b){
        BigDecimal result = new BigDecimal(0);

        result = result.add(a);
        return result.add(BigDecimal.valueOf(b));
    }

    /**
     * Sums two numbers of type double and BigDecimal
     * @param a
     * @param b
     * @return sum of a and b
     */
    public BigDecimal sum(double a, BigDecimal b){
        return sum(b, a);
    }

}
