//Compile Time Exception
public class compileTE {
    public static void main(String[] args){
        Thread T = new Thread(() -> {
            try{
                System.out.println("Thread sleep");
                Thread.sleep(2000);
                System.out.println("Thread wake");
            }
            catch(InterruptedException e){
                System.out.println("Thread is interrupted");
            }
        });
        T.start();
        try{
            Thread.sleep(6000);
            System.out.println("Main method thread ");
        }
        catch(InterruptedException e){
            System.out.println("Not T");
        }
        T.interrupt(); 
    }
}