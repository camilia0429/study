package exam03;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDateTime;
@Builder @ToString
public class Users {
    @ToString.Exclude
    private String userId; // 아이디
    private String userPw; // 비밀번호
    private String userNm; // 회원명
    private LocalDateTime regDt; // 회원 가입일시
}
