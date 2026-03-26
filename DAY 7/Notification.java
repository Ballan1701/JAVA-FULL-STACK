//method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
class Notify{
    String name;
    String message;

    void send(){
        System.out.println("sending notification");
    }
    Notify(String name,String message){
        this.name = name;
        this.message = message;
    }
}
class Email extends Notify{
    @Override
    void send(){
        System.out.println("\nsending Email to "+name+"\nMessage was : "+message);
    }
    Email(String name,String message){
        super(name,message);
    }
}
class sms extends Notify{
    @Override
    void send(){
        System.out.println("\nsending SMS to "+name+"\nMessage was : "+message);
    }
    sms(String name,String message){
        super(name,message);
    }
}
public class Notification {
    public static void main(String[] args) {
        Notify[] n = { new Email("RAGHU","Order was placed successfully"), new sms("GURU","OTP is 1234") };
        for(Notify a : n) {
            a.send();
        }
    }
}
