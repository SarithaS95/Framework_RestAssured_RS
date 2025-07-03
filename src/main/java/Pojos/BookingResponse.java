package Pojos;

public class BookingResponse {

    private int Bookingid;
    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getBookingid() {
        return Bookingid;
    }

    public void setBookingid(int bookingid) {
        Bookingid = bookingid;
    }
}

