package com.clouway.task_exceptions;


public class StringSumator {
    /**
     * Default constructor
     */
    public StringSumator(){}

    /**
     * Sums two numbers represented as strings and prints the result.
     * @param a
     * @param b
     * @return
     */
    public String sumStr(String a, String b){
        try{
            int result = Integer.parseInt(a) + Integer.parseInt(b);
            return String.format("%d", result);
        }
        
        catch(NumberFormatException e){
            return String.format("Error: Bad number format: %s\n", e.getMessage());
        }
    }
}
