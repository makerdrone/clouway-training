package task_exceptions;


import java.util.Scanner;

public class Console {
    /**
     * Default constructor
     */
    public Console(){}

    /**
     * Scans the console for user input and echoes it.
     * 
     * Throws a ZeroToHundredException if the entered number is less than 0
     * or greater than 100.
     * @throws ZeroToHundredException
     */
    public void echoMe() throws ZeroToHundredException{
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 100: ");
        
        int value = scan.nextInt();
        
        if(value < 0 || value > 100){
            throw new ZeroToHundredException("Number out of [0, 100] range.");
        }
        
        System.out.printf("You entered the number %d\n\n", value);
    }
}
