package customer;

public class Customer {
    private long phoneNumber;
    private int rideCount;

    public Customer(long phoneNumber){
        this.phoneNumber = phoneNumber;
        this.rideCount = 0;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public int getRideCount(){
        return rideCount;
    }

    public void addRideCount(){
        rideCount += 1;
    }
}
