class Notification{
    String name;
    String message;
    String contact_detail;
    void send(){
        System.out.println("sending notification");
    }
    Notification(String name,String message,String contact_detail){
        this.name = name;
        this.message = message;
        this.contact_detail = contact_detail;
    }
}
class Email extends Notification{
    void send(){
        System.out.println("From : "+contact_detail+"\nsending Email to "+name+"\nMessage was : "+message);
    }
    Email(String name,String message,String email){
        super(name,message,email);
    }
}
class sms extends Notification{
    void send(){
        System.out.println("Ph_no : "+contact_detail+"\nsending SMS to "+name+"\nMessage was : "+message);
    }
    sms(String name,String message,String ph_no){
        super(name,message,ph_no);
    }
}
public class Notify {
    public static void main(String[] args) {
        Notification n=new Email("RAGHU","You choose we do it","raghu1234@gmail.com");
        n.send();
        System.out.println("*****************************");
        n = new sms("GURU","Meet me at SJCE ","9876543210");
        n.send();
        }
}
