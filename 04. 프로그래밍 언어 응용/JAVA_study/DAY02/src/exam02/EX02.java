package exam02;

public class EX02 {
    public static void main(String[] args) {
        int age = 22;
        if (age < 8) {
            System.out.println("유치원");
        } else if(age < 14) {
            System.out.println("초등학교");
        } else if(age < 17) {
            System.out.println("중학교");
        } else if(age <20) {
            System.out.println("고등학교");
        } else {
            System.out.println("성인");
        }
    }//main
}
