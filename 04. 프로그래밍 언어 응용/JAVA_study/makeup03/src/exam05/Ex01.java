package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        Buy buy = order;
        buy.Buy();

        Sell sell = order;
        sell.Sell();
    }
}
