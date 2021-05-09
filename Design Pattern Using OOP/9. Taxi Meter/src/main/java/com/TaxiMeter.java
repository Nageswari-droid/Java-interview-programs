package com;

import java.util.*;
import car.*;
import customer.Customer;

public class TaxiMeter {

    static List<Customer> customerList = new ArrayList<>();

    public static  void getInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance");
        int distance = scanner.nextInt();

        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();

        String result = setDistanceAndPhoneNumber(distance, phoneNumber);
        System.out.println(result);
    }

    public static String setDistanceAndPhoneNumber(int distance, String phoneNumber){

        int flag = 0;
        int rideCount = 0;
        double discount = 0;

        Car mini = new Mini();
        Car sedan = new Sedan();
        Car suv = new SUV();

        if(customerList.size() != 0){
            for(int i = 0 ; i < customerList.size() ; i++) {
                String eachCustomerPhoneNumber = customerList.get(i).getPhoneNumber();
                if (eachCustomerPhoneNumber.equals(phoneNumber)) {
                    rideCount = customerList.get(i).getRideCount();
                    customerList.get(i).addRideCount();
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0){
            Customer customer = new Customer(phoneNumber);
            customerList.add(customer);
            customerList.get(customerList.size() - 1).addRideCount();
            discount = ((double) 25 / (double)100);
        }

        if(rideCount != 0 && rideCount % 2 == 0){
            discount = ((double) 10 / (double) 100);
        }

        int miniTotalFare = mini.calculateTotalFare(distance);
        int sedanTotalFare = sedan.calculateTotalFare(distance);
        int suvTotalFare = suv.calculateTotalFare(distance);

        double miniDiscountFare = miniTotalFare - (discount * miniTotalFare);
        double sedanDiscountFare = sedanTotalFare - (discount  * sedanTotalFare);
        double suvDiscountFare = suvTotalFare - (discount * suvTotalFare);

        String result = "Mini - Rs. " + miniDiscountFare +", Sedan - Rs. " + sedanDiscountFare + ", SUV - Rs. " + suvDiscountFare;
        return result;
    }

    public static void main(String args[]) {
        int i = 0;
        while(i != 5){
            getInput();
            i++;
        }
    }
}
