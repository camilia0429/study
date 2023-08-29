package exam01;

public interface Seller {
    void seller();

    default void order(){
        System.out.println("Seller - 주문");
    }
}
