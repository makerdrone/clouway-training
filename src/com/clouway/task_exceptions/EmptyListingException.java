package com.clouway.task_exceptions;


public class EmptyListingException extends Exception {

    public EmptyListingException(){
        super();
    }

    public EmptyListingException(String msg){
        super(msg);
    }
}
