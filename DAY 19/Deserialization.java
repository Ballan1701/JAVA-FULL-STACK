import java.io.*;
public class Deserialization {
    public static void main(String[] args)throws Exception{
        FileInputStream fi = new FileInputStream("student.txt");
        ObjectInputStream objStream = new ObjectInputStream(fi);
        while(true){
            try{
                Student s1 = (Student) objStream.readObject();
                System.out.println("Name: "+s1.name);
                System.out.println("Mark: "+s1.mark);
            }
            catch(EOFException e)
            {
                break;
            }    
            
        }
        fi.close();
        objStream.close();

    }
}