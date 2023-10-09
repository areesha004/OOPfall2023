package Assignment_1;

public class Main {
    public static void main(String[] args) {
   Bus bus= new Bus();
   bus.display();

        System.out.println("\n\t\t\t....these are the available seats.......");
        bus.availableseats();
        System.out.println("\n\t\t booking of seats");
     bus.bookseats();
     bus.cancelseats();
    }
}
