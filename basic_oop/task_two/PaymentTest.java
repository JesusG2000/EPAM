package by.etc.basic_oop.task_two;

public class PaymentTest {
    public static void main(String[] args) {
        Payment.Product[] products=new Payment.Product[2];
        products[0] = new Payment.Product(100,"Milk");
        products[1] = new Payment.Product(200,"Meat");
        Payment payment =new Payment(280,products);
        payment.paid();
    }
}
