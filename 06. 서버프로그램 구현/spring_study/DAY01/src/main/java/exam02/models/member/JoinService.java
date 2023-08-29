package exam02.models.member;

import exam02.models.member.MemberDao;
import jakarta.servlet.http.HttpServletRequest;
import Validators.Validator;
import org.springframework.beans.factory.annotation.Autowired;

public class JoinService {

    @Autowired
    private Validator<Member> validator;
    @Autowired
    private MemberDao memberDao;

    public JoinService() {}

    public JoinService(Validator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void join(Member member) {

        // 유효성 검사
        validator.check(member);

        // 회원 가입
        memberDao.register(member);

    }


}
