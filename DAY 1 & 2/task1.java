// Design shopping cart system
import java.util.*;
class product
{
    public static int stock;
    int id;
    String name;
    double price; 
    int quantity;
    product(int id,String name,double price,int quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalPrice()
    {
        return (double)quantity*price;
    }
    public void display()
    {
        System.out.println("*****  DETAILS  *****");
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("QUANTITY : "+quantity);
        System.out.println("TOTAL_PRICE : ₹"+getTotalPrice());
        System.out.println("--------------------------------------");
    }
}
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("NO. OF PRODUCT :" );
        int n = sc.nextInt();
        product[] p = new product[n];  //OBJECT ARRAY   
        double grand_total = 0.0;
        for(int i=0;i<n;i++)
        {
            System.out.print("ENTER ID : ");
            int id = sc.nextInt();
            System.out.print("ENTER NAME :");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("ENTER PRICE : ₹");
            double price = sc.nextDouble();
            System.out.print("ENTER QUANTITY :");
            int quantity = sc.nextInt();

            p[i] = new product(id,name,price,quantity);
            grand_total += p[i].getTotalPrice();  
        }
        for(int i=0;i<n;i++)
        {
            p[i].display();
            System.out.println("--------------------------------------");
        }
        System.out.println("Grand Total : ₹"+grand_total);
    }
}

/*
public static void main(String[] args)
{
    Product p1 = new Product(1,laptop,50000.00);
    Product p1 = new Product(2,mouse,300.00);
    Product p1 = new Product(3,keyboard,2500.00); 
    Product[] cart = {p1,p2,p3};
    double grandtotal = 0.0;
    for(Product p:cart){
        p.display;
        grandtotal += p.getTotalPrice();
     
    }
    System.out.println("GRAND TOTAL PRICE :"+grandtotal);

}

*/