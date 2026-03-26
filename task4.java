//Task : Mini Game
// ->Create a simple game have 3 characters : warrior, mage, archer
// All character have attack warrior -> attack with sword,archer -> attack with arrow, mage -> attack with magic.
//one common reference name
import java.util.*;
class character{
    String name;
    String type;
    void attack(){
        System.out.println( type + " " + name + " attacks with weapon");
    }
}
class warrior extends character{
    void attack(){
        System.out.println("Warrior " + name + " attacks with sword");
    }
    warrior(String name,String type){
        this.name = name;
        this.type = type;
    }
}
class mage extends character{
    void attack(){
        System.out.println("Mage " + name + " attacks with magic");
    }
    mage(String name,String type){
        this.name = name;
        this.type = type;
    }
    
}
class archer extends character{
    void attack(){
        System.out.println("Archer " + name + " attacks with arrow");
    }
    archer(String name,String type){
        this.name = name;
        this.type = type;
    }   
}
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String type = sc.nextLine();
        character c;
        if(type.equals("warrior")){
            c = new warrior(name,type);
        }
        else if(type.equals("mage")){
            c = new mage(name,type);
        }
        else{
            c = new archer(name,type);
        }
        c.attack();
    }
}
