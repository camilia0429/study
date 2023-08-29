package exam03;

public class Ex01 {
    public static void main(String[] args) {
        loginService service = new loginService();
        try {
            service.login("user01","1234");
        } catch (UserIdIncorrectException | UserPwIncorrectException e) {
            System.out.println(e.getMessage());
        }

    }
}
