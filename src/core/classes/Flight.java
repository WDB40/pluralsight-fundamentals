package core.classes;

public class Flight {

    private int passengers;
    private int seats;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Flight(){
        seats = 150;
        passengers = 0;
    }

    public void addOnePassenger(){
        if(passengers < seats){
            passengers++;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany(){
        System.out.println("Too many");
    }

    public boolean hasRoom(Flight otherFlight){

        int total = this.passengers + otherFlight.passengers;
        return total <= seats;

    }

    public Flight mergeWithFlight(Flight otherFlight){

        Flight combinedFlight = new Flight();
        combinedFlight.seats = this.seats;
        combinedFlight.passengers = this.passengers + otherFlight.passengers;
        return combinedFlight;
    }
}
