package core;

import core.classes.Flight;
import core.classes.MyClass;

public class Application {

    public static void main(String[] args) {

        Flight flight = new Flight();
        flight.addOnePassenger();

        MyClass myClass = new MyClass();
        myClass.showSum(7.5, 1.4, 3);

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        lax1.setPassengers(100);
        lax2.setPassengers(50);

        Flight lax3 = null;

        if(lax1.hasRoom(lax2)){
            lax3 = lax1.mergeWithFlight(lax2);
        }

        if(lax3!=null) {
            System.out.println(lax3.getPassengers());
        }
    }
}
