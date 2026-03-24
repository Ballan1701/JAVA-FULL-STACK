// Task (Multiple Booking platform)

// ->RideBooking, Food delivery, Parcel Delivery
// Requirement
// ->All users share common details but each
// ->service has specialized users
// ->user (name, phone, location) displayInfo()
// ->rideuser vehicletype displyRide
// ->food-favfood, parceluser-parcelweight

import java.util.*;
class user{
    String name;
    String phone_no;
    String address;
    user(String name,String phone_no,String address){
        this.name = name;
        this.phone_no = phone_no;
        this.address = address;
    }
}
class rideuser extends user{
    String vehicle_type;
    rideuser(String name,String phone_no,String address,String vehicle_type){
        super(name,phone_no,address);
        this.vehicle_type = vehicle_type;
    }
    void displayRide(){
        System.out.println("Name : "+name);
        System.out.println("Phone No : "+phone_no);
        System.out.println("Address : "+address);
        System.out.println("Vehicle Type : "+vehicle_type);
    }
}
class fooduser extends user{
    String fav_food;
    fooduser(String name,String phone_no,String address,String fav_food){
        super(name,phone_no,address);
        this.fav_food = fav_food;
    }
    void displayFood(){
        System.out.println("Name : "+name);
        System.out.println("Phone No : "+phone_no);
        System.out.println("Address : "+address);
        System.out.println("Favourite Food : "+fav_food);
    }
}
class parceluser extends user{
    String parcel_weight;
    parceluser(String name,String phone_no,String address,String parcel_weight){
        super(name,phone_no,address);
        this.parcel_weight = parcel_weight;
    }
    void displayParcel(){
        System.out.println("Name : "+name);
        System.out.println("Phone No : "+phone_no);
        System.out.println("Address : "+address);
        System.out.println("Parcel Weight : "+parcel_weight);
    }
}

public class task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NAME : ");
        String name = sc.nextLine();
        System.out.print("ENTER PHONE NO : ");
        String phone_no = sc.nextLine();
        System.out.print("ENTER ADDRESS : ");
        String address = sc.nextLine();
        rideuser R = new rideuser(name,phone_no,address,"Car");
        fooduser F = new fooduser(name,phone_no,address,"Pizza");
        parceluser P = new parceluser(name,phone_no,address,"5kg");

        R.displayRide();
        System.out.println("--------------------------------------");
        F.displayFood();
        System.out.println("--------------------------------------");
        P.displayParcel();
    }
}
