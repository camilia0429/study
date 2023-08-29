package exam07;

public interface Seller {
    void sell();

    default void order() {
        System.out.println("Seller 주문");
    }
}
