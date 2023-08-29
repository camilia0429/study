package exam02;
public class Human extends Animal {

    public void move() {
//    public void Move() { // 오류 발생하지 X 새로운 메서드를 정의 한 것 / @Override 사용 시 재 정의한 메서드라고 컴파일러에게 알려준 것
        System.out.println("두발로 직립보행");
    }
    public void readBook() {
        System.out.println("책을 읽는다");
    }
}
