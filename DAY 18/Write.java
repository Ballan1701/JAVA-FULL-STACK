
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Write {
    public static void main(String[] args){
        try{
            //FileWriter writer = new FileWriter("test.txt"); // FASTER THAN BUFFEREDWRITER
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter");
            writer.write("Write using FileWriter2");
            writer.write("Write using FileWriter3");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }


    }
}
