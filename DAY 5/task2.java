// APP ->food delivery app
//     ->travel app like rapido
import java.util.*;
class user{
    String name;
    String phone_no;
    String address;
    String role = "USER";
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
    }
}
class Driver extends user{
    String ROLE = "DRIVER";
    String vehicle;
    Driver(String name,String vehicle){
        this.name = name;
        this.vehicle = vehicle;
    }

}
public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Driver D = new Driver ("Guru", "Honda City");

    
    }
}
