package exam03;

public class loginService {
    public void login(String userId, String userPw) throws UserIdIncorrectException, UserPwIncorrectException {
        // userId - user01, userPw - 1234

            if(!userId.equals("user01")) { // 아이디 불일치
                throw new UserIdIncorrectException("ID가 일치하지 않습니다");


            }
            if(!userPw.equals("1234")) { // 비밀번호 불일치
                throw new UserPwIncorrectException("비밀번호가 일치하지 않습니다");
            }
            System.out.println("로그인 성공");

    }
}
