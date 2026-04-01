/*
Design Document editor where user create different types of document like text_doc,ImageDoc,SpreadsheetDoc
REQUIREMENT:
1. Each Document should -> open, save,close
2. Different document types behave differently
    ->Text - shows text content
    ->Image - renders Image
    ->Spreadsheet - Calculate cells
3.RULES:
 User should not know internal logic //abstraction
 Document data must be protected //encapsulation
 System should allow adding  new document types //polymorphism 
   
*/

// Interface → Abstraction 
interface DocumentActions {
    void open();
    void getName();
    void save();
    void close();
    void process();
}

// Abstract class → partial implementation + encapsulation
abstract class Document implements DocumentActions {

    private String name;
    private int size;

    public Document(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void getName() {
        System.out.println("NAME: " + name);
        System.out.println("SIZE: " + size + "KB");
    }+
    @Override
    public void open() {
        System.out.println("Opening " + name);
    }
    @Override
    public void save() {
        System.out.println("Saving " + name);
    }
    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
    public abstract void process();
}

// Text Document
class TextDoc extends Document {
    public TextDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.println("Showing text content: " );
        getName();
    }
}

// Image Document
class ImageDoc extends Document {
    public ImageDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.println("Rendering image: ");
        getName();
    }
}

// Spreadsheet Document
class SpreadsheetDoc extends Document {
    public SpreadsheetDoc(String name, int size) {
        super(name, size);
    }

    public void process() {
        System.out.println("Calculating cells: " );
        getName();
    }
}

// Main class
public class task7 {
    public static void main(String[] args) {

        Document[] docs = {
            new TextDoc("file.txt", 10),
            new ImageDoc("photo.png", 20),
            new SpreadsheetDoc("data.xlsx", 30)
        };

        for (Document doc : docs) {
            doc.open();
        doc.process();
        doc.save();
        doc.close();
        doc.getName();
        System.out.println("-------------");
        }
    }
}
