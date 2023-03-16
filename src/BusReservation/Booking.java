package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    int busNo;
    String passengerName;
    Date date;
    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of passenger: ");
        passengerName = sc.next();
        System.out.println("Enter bus number :");
        busNo = sc.nextInt();
        System.out.println("Enter the Date dd-MM-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
        public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
            int capacity=0;
            for(Bus bus:buses){
                if(bus.getBusNo()==busNo)
                    capacity=bus.getCapactiy();

            }
            int booked=0;
            for(Booking b:bookings) {
                if (b.busNo ==busNo && b.date.equals(date)) {
                    booked++;
                }
            }
            return booked<capacity?true:false;
        }
    }
