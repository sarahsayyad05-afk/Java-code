package railway.exception;

public class InvalidBookingException extends Exception {
      String msg;
     public InvalidBookingException(String msg){
        super(msg);
        
    }
   
}
