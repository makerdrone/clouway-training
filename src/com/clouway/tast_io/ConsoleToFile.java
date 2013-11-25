package task_io;

import java.io.*;


public class ConsoleToFile {
    private ConsoleReader reader = new ConsoleReader();
    private String filePath;
    
    public ConsoleToFile(){
        System.out.print("File to write data: ");
        reader.readString();
        
        this.filePath = reader.getStringData();

        System.out.println("Begin inputting data to file. Write a single \".\"(dot) to stop.");
        
        String data;
        while(true){
            System.out.print("In: ");
            reader.readString();
            
            data = reader.getStringData();
            
            if(data.equals("."))
                break;

            System.out.printf("Wrote '%s'\n", data);
            writeToFile(data);
        }
        
        System.out.println("Done.");
    }

    /**
     * Method to append a string to the file
     */
    private void writeToFile(String data){
        File outFile = new File(this.filePath);
        
        try{
            FileWriter fwriter = new FileWriter(outFile, true);
            PrintWriter output = new PrintWriter(fwriter);
            
            output.print(data);
            output.println();
            
            output.close();
            fwriter.close();
        }

        catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
