package exam04;

public interface Calculator {
    int num = 10; // 컴파일러가 public static final 자동추가 => 정적 상수
    int add(int num1, int num2); // 컴파일러가 public abstract 자동 추가. 다른 접근제어자를 사용 할 경우 오류 발생

    default int minus(int num1, int num2){
        return num1 - num2;
    };
}
