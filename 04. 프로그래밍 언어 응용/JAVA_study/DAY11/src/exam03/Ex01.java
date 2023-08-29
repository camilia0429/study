package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        // 실행되며 이 때 Object -> Apple 형변환 발생

        appleBox.put(new Apple());
//        appleBox.put(new Melon()); // Apple X -> 오류발생

        Apple apple = appleBox.get();
        System.out.println(apple.get());
    }
}
