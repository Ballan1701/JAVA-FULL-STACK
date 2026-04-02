/*
TASK : E - commerce Order System
Design System where user can place order, while ordering System must handle failures using the exceptional Handling
1.Product out of stock
2.Payment Failed
3.Order processing failed
classes: Product(name,stock,price),User(name,address), Order(product,user,quantity), OrderService(placeOrder(Order))

*/
import java.lang.Math;
import java.util.Random;
class productOutOfStock extends Exception {
    productOutOfStock(String msg) {
        super(msg);
    }
}
class paymentFailed extends Exception {
    paymentFailed(String msg) {
        super(msg);
    }
}
class orderProcessingFailed extends Exception {
    orderProcessingFailed(String msg) {
        super(msg);
    }
}
class Product{  
    String name;
    int stock;
    double price;
    Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}
class User{
    String name;
    String address;
    User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product, User user, int quantity) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}
class OrderService {
    void placeOrder(Order order) throws productOutOfStock, paymentFailed, orderProcessingFailed {
        if(order.product.stock < order.quantity) {    //Order.product.stock <=0
            throw new productOutOfStock("Product is out of stock");
        }
        if(Math.random() < 0.4) { // Simulating a random payment failure with 40% chance
                throw new paymentFailed("Payment Failed");
        }
        if(Math.random() < 0.2) { // Simulating a random order processing failure with 20% chance
            throw new orderProcessingFailed("Order processing failed");
        }
        order.product.stock -= order.quantity;
        System.out.println("Order placed successfully of " + order.quantity + " " + order.product.name + "(s) by " + order.user.name);
    }

    public class Service {
    }
}

public class task8 {
    public static void main(String[] args) {
        Product product = new Product("Grapics card", 10, 40999.99);
        User user = new User("Ragu;", "123 swami nagar");
        Order order = new Order(product, user, 6);
        OrderService orderService = new OrderService();
        try {
            orderService.placeOrder(order);
        } catch (productOutOfStock | paymentFailed | orderProcessingFailed e) {
            System.out.println("Order failed: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for shopping with us!");
        }
    }
}
