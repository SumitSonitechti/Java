package TicketBookingSystem;

public class TicketBooking {
    private int seatAvailable = 2;

    public synchronized void bookTicket(String customername){
        if(seatAvailable > 0){
            System.out.println(customername+" is trying to Book a seat");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            seatAvailable--;
            System.out.println(customername+" Booking is confirmed");
        }
        else {
            System.out.println("Seat is already booked");
        }
    }
}
