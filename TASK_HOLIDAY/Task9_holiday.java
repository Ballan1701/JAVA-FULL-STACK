/*
Task 17: Ride Sharing App Problem Statement: Design and implement a ride sharing app using Object-Oriented Programming principles. 
Requirements:- Identify core entities and their relationships.- Apply Encapsulation to protect data.- Use Inheritance for common behaviors.- Implement Polymorphism where behavior varies.- Use Abstraction to hide complexity. 
Expected Classes:- Define at least 4–6 classes with proper relationships.- Include attributes, constructors, and methods. 
Advanced Requirements:- Add validation and error handling.- Extend system with at least one extra feature. 
Deliverables:- Class design (UML optional)- Java implementation- Sample test cases
 */
import java.util.*;
// ABSTRACT
abstract class User {
    private String name;
    private String phone;
    private String location;

    User(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    // Encapsulation
    public String getName() { 
        return name; 
    }
    public String getPhone() { 
        return phone; 
    }
    public String getLocation() {
         return location; 
    }

    abstract void display();
}

//Inheritance
class Driver extends User {
    private String vehicle;

    Driver(String name, String phone, String location, String vehicle) {
        super(name, phone, location);
        this.vehicle = vehicle;
    }

    void display() {
        System.out.println("Driver Name : " + getName());
        System.out.println("Phone : " + getPhone());
        System.out.println("Location : " + getLocation());
        System.out.println("Vehicle : " + vehicle);
    }
}

class Rider extends User {
    private String pickup;
    private String drop;

    Rider(String name, String phone, String location, String pickup, String drop) {
        super(name, phone, location);
        this.pickup = pickup;
        this.drop = drop;
    }

    public String getPickup() {
         return pickup; 
    }
    public String getDrop() {
         return drop; 
    }

    void display() {
        System.out.println("Rider Name : " + getName());
        System.out.println("Phone : " + getPhone());
        System.out.println("Location : " + getLocation());
        System.out.println("Pickup : " + pickup);
        System.out.println("Drop : " + drop);
    }
}

class Ride {
    private Rider r;
    private Driver d;
    private double distance;
    double fare;

    Ride(Rider r, Driver d, double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than 0");
        }
        this.r = r;
        this.d = d;
        this.distance = distance;
        this.fare = calculateFare();
    }

    double calculateFare() {
        double baseFare = 50;
        double costPerKm = 10;
        return baseFare + (distance * costPerKm);
    }

    void startRide() {
        System.out.println("Ride Started...");
    }

    void endRide() {
        System.out.println("Ride Ended. Total Fare = ₹" + fare);
    }
}

// POLYMORPHISM 
interface Payment {
    void pay(double amount);
}

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

class Upi implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class Task9_holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("ENTER NAME : ");
            String name = sc.nextLine();

            System.out.print("ENTER PHONE : ");
            String phone = sc.nextLine();

            System.out.print("ENTER LOCATION : ");
            String location = sc.nextLine();

            if (name.isEmpty() || phone.isEmpty() || location.isEmpty()) {
                throw new Exception("Invalid Input! Fields cannot be empty.");
            }

            System.out.print("ENTER PICKUP LOCATION : ");
            String pickup = sc.nextLine();

            System.out.print("ENTER DROP LOCATION : ");
            String drop = sc.nextLine();

            System.out.print("ENTER DISTANCE (km): ");
            double distance = sc.nextDouble();

            Driver d = new Driver(name, phone, location, "Car");
            Rider r = new Rider(name, phone, location, pickup, drop);

            System.out.println("\n--- DRIVER DETAILS ---");
            d.display();

            System.out.println("\n--- RIDER DETAILS ---");
            r.display();

            Ride ride_1 = new Ride(r, d, distance);
            ride_1.startRide();

            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Cash");
            System.out.println("2. UPI");
            int choice = sc.nextInt();

            Payment p;

            if (choice == 1) {
                p = new Cash();
            } else if (choice == 2) {
                p = new Upi();
            } else {
                throw new Exception("Invalid Payment Choice!");
            }

            p.pay(ride_1.fare);
            ride_1.endRide();

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter correct data.");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("\nThank you for using Ride Sharing App !");
        }
    }
}
