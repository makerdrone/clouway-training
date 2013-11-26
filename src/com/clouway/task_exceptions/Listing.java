package com.clouway.task_exceptions;


public class Listing {
    private Object[] elements;
    private int containing = 0;

    /**
     * Constructor setting the capacity
     * @param capacity
     */
    public Listing(int capacity){
        if(capacity <= 0){
            capacity = 1;
        }
        
        this.elements = new Object[capacity];
    }

    /**
     * Add an element to the end.
     * 
     * Throws a ListingOverflowException if capacity is already filled.
     * @param obj   the object to add
     * @throws ListingOverflowException
     */
    public void add(Object obj) throws ListingOverflowException{
        if(this.containing >= this.elements.length){
            throw new ListingOverflowException("Cannot add object. Listing already full.");
        }
        
        this.elements[this.containing] = obj;
        this.containing ++;
    }

    /**
     * Remove last element.
     * 
     * Throws an EmptyListingException if empty.
     * @throws EmptyListingException
     */
    public void remove() throws EmptyListingException{
        if(this.containing <= 0){
            throw new EmptyListingException("Cannot remove element. Listing is empty.");
        }
        
        this.containing --;
        this.elements[this.containing] = null;
    }

    /**
     * Print all elements to the console
     */
    public void printAllElements(){
        for(int i=0; i<this.containing; i++){
            System.out.printf("%s, ", this.elements[i]);
        }
    }
}
