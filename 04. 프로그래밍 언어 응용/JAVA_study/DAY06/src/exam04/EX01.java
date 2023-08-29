package exam04;

public class EX01 {
    public static void main(String[] args) {
        Animal human = new Human();
        human.move();

        Animal dog = new Dog();
        dog.move();

        Animal bird = new Bird();
        bird.move();
    }
}
