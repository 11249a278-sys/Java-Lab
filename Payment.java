interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment made using UPI.");
        System.out.println("Amount Paid: " + amount);
    }
}

class CardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment made using Card.");
        System.out.println("Amount Paid: " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.pay(1500);
        System.out.println();

        p2.pay(2500);
    }
}