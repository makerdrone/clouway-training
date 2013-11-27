package com.clouway.task_exceptions;

/**
 * Stefan.Dimitrov
 */

public class Main {
    
    public static void main(String[] argv){
        System.out.println("\nTesting string sum.");
        testStringSumator();

        System.out.println("\nTesting console reading.");
        testConsole();

        System.out.println("\nTesting listing exceptions");
        testListing();
    }

    /**
     * Method to test the string sumator
     */
    public static void testStringSumator(){
        StringSumator sumator = new StringSumator();
        
        // Print a correct sum
        System.out.println(sumator.sumStr("300", "28"));
        
        // Print result of an incorrect operation
        System.out.println(sumator.sumStr("345yrsxn", "5"));
    }

    /**
     * Method to test the console input
     */
    public static void testConsole(){
        Console cons = new Console();
        try{
            // Prompt for a number until an exception is thrown
            while(true)
                cons.echoMe();
        }
        catch (ZeroToHundredException e){
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }

    /**
     * Method to test the Listing
     */
    public static void testListing(){
        Listing list = new Listing(5);
        
        try{
            // Remove from empty list
            list.remove();
        }
        catch(EmptyListingException e){
            System.out.printf("Error: %s\n", e.getMessage());
        }
        
        try{
            // Add more elements than capacity
            list.add("Element 1");
            list.add("Element 2");
            list.add(new Integer(3));
            list.add(new Double(3.6));
            list.add("Last element");
            list.add("This one will throw an exception.");

        }
        catch(ListingOverflowException e){
            System.out.printf("Error: %s\n", e.getMessage());
        }

        try{
            // Remove from non-empty list(no exception)
            System.out.println();
            list.printAllElements();
            
            System.out.println("\nRemoving an element");
            list.remove();
            
            list.printAllElements();
        }
        catch(EmptyListingException e){
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }
}
