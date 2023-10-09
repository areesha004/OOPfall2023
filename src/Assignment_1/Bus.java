package Assignment_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Bus {
    int busNumber;
    int busSeats;
    Reservation[][][] reservation;
    Scanner sc = new Scanner(System.in);
    Random r1 = new Random();

    Bus() {
        reservation = new Reservation[3][7][];
        int counter = 101;
        int seat = 1;
        boolean isreserved;


        for (int i = 0; i < 3; i++) {
            seat = 1;
            int reservation_id = counter++;
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    reservation[i][j] = new Reservation[6];
                } else {
                    reservation[i][j] = new Reservation[4];
                }
                for (int k = 0; k < reservation[i][j].length; k++) {

                    int seatNumber = seat++;
                    isreserved = r1.nextBoolean();
                    reservation[i][j][k] = new Reservation(reservation_id, seatNumber, new Passenger("Passenger", "0300-4163455"), isreserved);
                }
            }
        }

    }

    void display() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\t\t.......bus number " + (i + 1) + " .....");
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < reservation[i][j].length; k++) {
                    System.out.println(reservation[i][j][k]);
                }
            }
        }
    }

    void availableseats() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\t\t.......bus number " + (i + 1) + " of route " + (i + 1) + " .....");
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < reservation[i][j].length; k++) {
                    if (!reservation[i][j][k].isreserved) {
                        System.out.println(reservation[i][j][k]);
                    }
                }
            }
        }
    }

    void route1seats(int routeno) {

        for (int j = 0; j < 7; j++) {
            for (int k = 0; k < reservation[routeno][j].length; k++) {
                if (!reservation[routeno][j][k].isreserved) {
                    System.out.println(reservation[routeno][j][k].getSeatNumber());
                }
            }

        }
    }

    void bookseats() {
        int route;

        String time;
        String date;
        String name;
        String contactno;
        int no;
        int[] seat=new int[10];

        System.out.println("enter your name......");
        name = sc.next();
        System.out.println("enter your contact no...");
        contactno = sc.next();

        System.out.println("enter 1 for lahore bus...");
        System.out.println("enter 2 for islamabad bus....");
        System.out.println("enter 3 for faisalabad bus....");
        route = sc.nextInt();
        System.out.println(route);
        switch (route) {
            case 1:
                System.out.println("these are the available seats...");
                route1seats(0);

                System.out.println("how many seats you want to book...");
                no = sc.nextInt();
                System.out.println("enter seats number...");
                for(int i=0;i<no;i++) {
                    seat[i] = sc.nextInt();
                }

                System.out.println("now mention date.. ");
                date = sc.next();
                System.out.println("also mention time.. ");
                time = sc.next();
                seatbooking(name, contactno, 0, Arrays.copyOf(seat,no));
                generateticket(name, contactno, 0, no, date, time,Arrays.copyOf(seat,no));
                break;
            case 2:
                System.out.println("these are the available seats...");
                route1seats(1);

                System.out.println("how many seats you want to book...");
                no = sc.nextInt();
                System.out.println("enter seats number...");
                for(int i=0;i<no;i++) {
                    seat[i] = sc.nextInt();
                }


                System.out.println("now mention date.. ");
                date = sc.next();
                System.out.println("also mention time.. ");
                time = sc.next();
                seatbooking(name, contactno, 1,Arrays.copyOf(seat,no) );
                generateticket(name, contactno, 1, no, date, time,Arrays.copyOf(seat,no));
                break;
            case 3:
                System.out.println("these are the available seats...");
                route1seats(2);

                System.out.println("how many seats you want to book...");
                no = sc.nextInt();
                System.out.println("enter seats number...");

                for (int i = 0; i < no; i++) {
                    seat[i] = sc.nextInt();
                }


                System.out.println("now mention date.. ");
                date = sc.next();
                System.out.println("also mention time.. ");
                time = sc.next();
                seatbooking(name, contactno, 2, Arrays.copyOf(seat,no));
                generateticket(name, contactno, 2, no, date, time,Arrays.copyOf(seat,no));
                break;
        }

    }
    void cancelseats(){
        System.out.println("...to cancel seats...");
        int route;
        int[] seat=new int [10];

        String name;

    int no;
        System.out.println("enter your name......");
        name= sc.next();

  System.out.println("enter route to cancel thi ticket...");
        System.out.println("enter 1 for lahore bus...");
        System.out.println("enter 2 for islamabad bus....");
        System.out.println("enter 3 for faisalabad bus....");
        route=sc.nextInt();
        System.out.println(route);
        switch(route){
     case 1:

      System.out.println("how many seats you want to cancel...");
    no = sc.nextInt();

        System.out.println("enter seats number...");
         for (int i = 0; i < no; i++) {
             seat[i] = sc.nextInt();
         }

         seatcancelling2(0,Arrays.copyOf(seat,no));
                break;

            case 2:
                System.out.println("how many seats you want to cancel...");
                no = sc.nextInt();

                System.out.println("enter seats number...");
                for (int i = 0; i < no; i++) {
                    seat[i] = sc.nextInt();
                }

                seatcancelling2(1,Arrays.copyOf(seat,no));

                break;

            case 3:

                System.out.println("how many seats you want to cancel...");
                no = sc.nextInt();

                System.out.println("enter seats number...");
                for (int i = 0; i < no; i++) {
                    seat[i] = sc.nextInt();
                }

                seatcancelling2(2,Arrays.copyOf(seat,no));
                break;



        }
    }



void seatbooking(String name, String contactno, int routeno, int[] seats) {
    for (int j = 0; j < 7; j++) {
        for (int k = 0; k < reservation[routeno][j].length; k++) {
            for (int seatNumber : seats) {
                if (!reservation[routeno][j][k].isreserved && reservation[routeno][j][k].getSeatNumber() == seatNumber) {
                    System.out.println("Your seat number " + reservation[routeno][j][k].getSeatNumber() + " booked successfully....");
                    reservation[routeno][j][k].isreserved = true;
                    reservation[routeno][j][k].getPassengers().setName(name);
                    reservation[routeno][j][k].getPassengers().setContact(contactno);
                }
            }
        }
    }
}

    void generateticket(String name,String contactno,int routeno,int noofseats,String date,String time,int[] seat){
        int price;
        int finalprice;
        System.out.println("......your ticket.....");
        System.out.println("Name : " + name);
        System.out.println("contact number : " +contactno );
        System.out.println("Bus Arrival time : " +time);
        System.out.println("date : " +date);
        for(int seatno : seat) {
            System.out.println("booked seats are " + seatno);
        }
        if(routeno==0) {
             price = 1000;
           finalprice = noofseats * price;
            System.out.println("Route for Lahore...." );
            System.out.println("price "+ finalprice );
        }
       else if(routeno==1) {
             price = 2000;
          finalprice = noofseats * price;
            System.out.println("Route for Islamabad...." );
            System.out.println("price "+ finalprice );
        }
       else if(routeno==2) {
             price = 1500;
           finalprice = noofseats * price;
            System.out.println("Route for faisalabad...." );
            System.out.println("price "+ finalprice );
        }
    }
    void seatcancelling2(int routeno,int[] seat) {
        for (int j = 0; j < 7; j++) {
            for (int k = 0; k < reservation[routeno][j].length; k++) {
                for(int seatno : seat){
                    if (reservation[routeno][j][k].isreserved && reservation[routeno][j][k].getSeatNumber() == seatno) {
                        System.out.println("your seat number " + reservation[routeno][j][k].getSeatNumber() + " cancelled successfully....");
                        reservation[routeno][j][k].isreserved = false;

                    }

                }
            }

        }

    }



}
