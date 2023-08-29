package exam01;



import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.time.LocalDateTime;
//@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode
@Data @AllArgsConstructor @NoArgsConstructor @Log
public class Users {
    private String userId; // 아이디
    private String userPw; // 비밀번호
    private String userNm; // 회원명
    private LocalDateTime regDt; // 회원 가입일시

    public void printMethod() {
        log.info("테스트 메세지");
    }

}
