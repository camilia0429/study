package exam01;

public class Order implements Buyer, Seller {

    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void order() {
//        Seller.super.order();
        System.out.println("주문");
    }

    @Override
    public void seller() {
        System.out.println("판매");
    }
}
