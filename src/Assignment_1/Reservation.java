package Assignment_1;

public class Reservation {
   private int reservation_id;
   private int seatNumber;
   private Passenger passengers;
   boolean isreserved;

    public boolean isIsreserved() {
        return isreserved;
    }

    public void setIsreserved(boolean isreserved) {
        this.isreserved = isreserved;
    }

    public Reservation(int reservation_id, int seatNumber, Passenger passengers, boolean isreserved) {
        this.reservation_id = reservation_id;
        this.seatNumber = seatNumber;
        this.passengers = passengers;
        this.isreserved = isreserved;
    }

    public int getReservation_id() {
        return reservation_id;
    }


    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Passenger getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger passengers) {
        this.passengers = passengers;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", seatNumber=" + seatNumber +
                ", passengers=" + passengers +
                ", isreserved=" + isreserved +
                '}';
    }
}
