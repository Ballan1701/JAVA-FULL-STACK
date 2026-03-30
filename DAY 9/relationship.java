//Abtraction --> has a relationship - composition type --> tightly coupled
class Battery{
    public void powerSupply(){
        System.out.println("still have 40% power");
    }
}
class Remote{
    Battery miniBattery = new Battery();
    Remote(){
        miniBattery = new Battery();
    }
    public void changeChannel(){
        miniBattery.powerSupply();
        System.out.println("Channel changed");
    }
}
public class relationship {
    public static void main(String[] args){
        Remote tvRemote = new Remote();
        tvRemote.changeChannel();
    }
}
