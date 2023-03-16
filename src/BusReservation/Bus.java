package BusReservation;

public class Bus {
   private int busNo;
   private boolean ac;
    private int capactiy;
     Bus(int no,boolean Ac,int cap){
         this.ac=Ac;
         this.busNo=no;
         this.capactiy=cap;
     }
    public int getCapactiy() {
        return capactiy;
    }

    public void setCapactiy(int cap) {
        capactiy = cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int No) {
        busNo = No;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean Ac) {
       ac = Ac;
    }
    public void displayBusInfo(){
        System.out.println("Bus No: "+busNo +" Ac: "+ac+ " Total capacity: " +capactiy);
    }
}
