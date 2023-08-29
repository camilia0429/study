package exam05;

public class Order implements Buy, Sell {
    @Override
    public void Buy() {
        System.out.println("구매");
    }

    @Override
    public void Sell() {
        System.out.println("판매");
    }
}
