package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) {
        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,1));
        buses.add(new Bus(3,true,30));
        for(Bus b:buses) {
            b.displayBusInfo();
        }


       int userOpt=1;
        while(userOpt==1){
            System.out.println("Enter 1 to Book 2 to Exit");
            Scanner sc=new Scanner(System.in);
            userOpt=sc.nextInt();
            if(userOpt==1){
                Booking booking=new Booking();
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                     System.out.println("your booking is Confirmed");
                }
                else{
                    System.out.println("sorry. Bus is Full.Try Another bus or date.");
                }
            }
        }
    }
}
