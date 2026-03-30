//abstract class
abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    abstract void setlevel(int level);
    void deviceInfo(){ // concrete method  
        System.out.println("It is a device");
    }
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    @Override
    void turnOff(){
        System.out.println("Light Off");
    }
    @Override
    void setlevel(int level){
        System.out.println("It is a level : "+level);
    }
}
interface Remote{
    void change();
}
interface wifi_control{
    void connect();
    void change();
}
class TV implements Remote,wifi_control{
    @Override
    public void change(){
        System.out.println("change channel");
    }
    @Override
    public void connect(){
        System.out.println("wifi connected");
    }
}
public class Smart {
    public static void main(String[] args){
        SmartDevice device = new Light(); // object to be only created for child class
        Remote r = new TV();
        wifi_control w = new TV();
        device.turnOn();
        device.turnOff();
        device.deviceInfo();
        device.setlevel(8);
        r.change();
        w.connect();
        w.change();
        
    }
}
