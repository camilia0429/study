package exam03;

public class Ex01 {
    public static void main(String[] args) {
        LoginService ls = LoginService.getInstance();
        LoginService ls2 = LoginService.getInstance();
        System.out.println(ls == ls2);

        System.out.println("ls : "+System.identityHashCode(ls));
        System.out.println("ls2 : "+System.identityHashCode(ls2));



    }
}
