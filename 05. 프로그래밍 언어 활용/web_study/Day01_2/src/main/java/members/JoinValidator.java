package members;

import Validators.RequiredValidator;
import Validators.Validator;

public class JoinValidator implements Validator<Users>, RequiredValidator {
    @Override
    public void check(Users user) {
//        필수 항목 체크
        String userId = user.getUserId();
        String userPw = user.getUserPw();
        String userNm = user.getUserNm();

        checkRequired(userId, new ValidationException("아이디를 입력하세요"));
        checkRequired(userPw, new ValidationException("비밀번호를 입력하세요"));
        checkRequired(userNm, new ValidationException("이름을 입력하세요"));


//        String userId = user.getUserId();
//        if(userId == null || userId.isBlank()) {
//            throw new ValidationException("아이디를 입력하세요");
//        }
//        String userPw = user.getUserPw();
//        if(userPw == null || userPw.isBlank()) {
//            throw new ValidationException("비밀번호를 입력하세요");
//        }
    }
}
