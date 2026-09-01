package TicketBookingSystem;

public class MyTicketBooking {
    public static void main(String[] args){
        TicketBooking booking = new TicketBooking();

        Customer c1 =new Customer("Rahul",booking);
        Customer c2=new Customer("Priya",booking);
        Customer c3=new Customer("Karan",booking);
        Customer c4=new Customer("Kamal",booking);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
