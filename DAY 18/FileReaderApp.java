import java.io.IOException;
import java.io.FileReader;
public class FileReaderApp {
    public static void main(String[] args){
        try{
            FileReader reader=new FileReader("test.txt");
            int character;
            while((character=reader.read())!=-1)
            {
                System.out.print((char)character);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    private int read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
}