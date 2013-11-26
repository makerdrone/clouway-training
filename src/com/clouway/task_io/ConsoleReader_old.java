package com.clouway.task_io;

import java.util.Scanner;

public class ConsoleReader_old {
    private Scanner scan = new Scanner(System.in);
    private String strData;
    private int intData;
    private char charData;
    //private int charPos;
    private float floatData;

    /**
     * Default constructor
     */
    public ConsoleReader_old(){}

    /**
     * Read a string from the console
     */
    public void readString(){
        this.strData = scan.next();
    }

    /**
     * Read an integer from the console
     */
    public void readInt(){
        this.intData = scan.nextInt();
    }

    /**
     * Read a character from the console
     */
    public void readChar(){
        this.charData = (char) scan.nextByte();
    }

    /**
     * Read a float from the console
     */
    public void readFloat(){
        this.floatData = scan.nextFloat();
    }

    /**
     * Return the string data component
     * @return
     */
    public String getStringData(){
        return this.strData;
    }

    /**
     * Return the integer data component
     * @return
     */
    public int getIntData(){
        return this.intData;
    }

    /**
     * Return the character data component
     * @return
     */
    public char getCharData(){
        return this.charData;
    }

    /**
     * Return the float data component
     * @return
     */
    public float getFloatData(){
        return this.floatData;
    }
}
