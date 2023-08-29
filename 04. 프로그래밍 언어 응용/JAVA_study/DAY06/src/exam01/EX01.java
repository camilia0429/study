package exam01;

public class EX01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.seller();

        Buyer buyer = order;
        Seller seller = order;

        order.order();

    }
}
