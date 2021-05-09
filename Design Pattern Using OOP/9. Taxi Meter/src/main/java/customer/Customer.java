package customer;

public class Customer {
    private String phoneNumber;
    private int rideCount;

    public Customer(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.rideCount = 0;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getRideCount(){
        return rideCount;
    }

    public void addRideCount(){
        rideCount += 1;
    }
}
