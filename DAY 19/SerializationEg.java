// import java.io.FileOutputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;

import java.io.*;
class Student implements Serializable{
        String name;
        int mark;
        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }
}
class CustomObjectOutputStream extends ObjectOutputStream {
    public CustomObjectOutputStream(OutputStream objStream) throws IOException {
        super(objStream);
    }
    @Override
    protected void writeStreamHeader() throws IOException {
        
    }
}
public class SerializationEg {
   public static void main(String[] args) throws IOException {
        Student s1 = new Student("qwerty",44);
        File file=new File("student.txt");
        FileOutputStream fos = new FileOutputStream(file,true); //open file
        //CustomObjectOutputStream obj=new CustomObjectOutputStream(fos); //obj to byte stream
        ObjectOutputStream objStream = null;
        if(file.length()==0)
        {
            objStream=new ObjectOutputStream(fos);
        }
        else
        {
            CustomObjectOutputStream obj1=new CustomObjectOutputStream(fos); // appending to the existing serialization file 
            obj1.writeObject(s1);
        }
        objStream.writeObject(s1); 
        fos.close();
        objStream.close();
   }
}
