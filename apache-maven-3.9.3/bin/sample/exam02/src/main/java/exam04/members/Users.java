package exam04.members;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Users {
    private String userId;
    private String userPw;
    private String userNm;

    private LocalDateTime regDt;
}
