package railway.service;

import railway.exception.InvalidBookingException;
public class RailwaySystem {
    int seats[]={50,40,60};
    public boolean validatePassenger(String n,int age,int trainno,int s) throws InvalidBookingException{
         if(!(n.matches("[A-Za-z ]+") )){

               throw new InvalidBookingException ("Name must contain only letter and spaces");

        }
        else if((age<5 || age>100)){
            throw new InvalidBookingException("Age Must be Between 5 and 100");

        }
        else if(trainno>seats.length){
            throw new InvalidBookingException("Train Number must be valid");

        }
        else if(s<0){
             throw new InvalidBookingException("Number of Seats must be greater than 0");
        }
        else if(s>seats[trainno]){
            throw new InvalidBookingException ("Number of Seats Exceeds the available seats in Train "+trainno);
        }
        else{

        }
        return true;
    }
     public void bookTicket(int trainno,int s){
        seats[trainno]-=s;
        System.out.println("Booking Confirmed");
     }
     public String generateTicketID(String n,int trainno){
        return "Ticket ID= "+n.substring(0,2)+trainno+"RLY";
     }
}
