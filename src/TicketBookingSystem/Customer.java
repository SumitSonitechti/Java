package TicketBookingSystem;

public class Customer extends Thread{
    private TicketBooking booking;
    private String customerName;

    public Customer(String name,TicketBooking booking){
        this.customerName=name;
        this.booking=booking;
    }

    @Override
    public void run(){
        booking.bookTicket(customerName);
    }
}
