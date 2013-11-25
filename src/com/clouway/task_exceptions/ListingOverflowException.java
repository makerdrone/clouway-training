package task_exceptions;


public class ListingOverflowException extends Exception {

    public ListingOverflowException(){
        super();
    }

    public ListingOverflowException(String msg){
        super(msg);
    }
}
