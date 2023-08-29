package tests;

import members.JoinService;
import members.JoinValidator;
import members.Users;
import members.ValidationException;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원 가입 테스트")
public class JoinTest {
    private JoinService joinService;

//    회원 가입 시 정상 회원 데이터
    private Users getUserSuccess() {
        Users users = new Users();
        users.setUserId("user01");
        users.setUserPw("_aA123456");
        users.setUserNm("사용자01");
        users.setRegDt(LocalDateTime.now());

        return users;
    }
    private Users getUserFail() {
        return new Users();
    }
    @BeforeEach // 초기화 작업
    void init() {
        JoinValidator joinValidator = new JoinValidator();
        joinService = new JoinService(joinValidator);
    }
    @Test
    @DisplayName("회원 가입 성공 시 예외 발생 없음")
    void joinSuccessTest() {
//        assertEquals(0,joinService.join());
        Assertions.assertDoesNotThrow(()->{
            joinService.join(getUserSuccess());
        });
    }

    @Test
    @DisplayName("필수항목(userId, userPw, userNm) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldsTest() {
        //        null 또는 빈 값(공백 포함) 일 경우 오류 발생
        Assertions.assertAll(
                () -> Assertions.assertThrows(ValidationException.class, () -> {
                    Users user = getUserSuccess();
                    user.setUserId(null);
                    joinService.join(user);
                }),
                () -> Assertions.assertThrows(ValidationException.class, () -> {
                    Users user = getUserSuccess();
                    user.setUserId("  ");
                    joinService.join(user);
                })
        );
        Assertions.assertAll(
                () -> {

                    ValidationException thrown = Assertions.assertThrows(ValidationException.class, () -> {
                        Users user = getUserSuccess();
                        user.setUserPw(null);
                        joinService.join(user);
                    });
                    // 정확한 예외 발생 문구
                    String message = thrown.getMessage();
                    Assertions.assertTrue(message.contains("아이디를 입력"));
                },
                () -> Assertions.assertThrows(ValidationException.class, () -> {
                    Users user = getUserFail();
                    user.setUserPw("  ");
                    joinService.join(user);
                })
        );
        Assertions.assertAll(
                () -> Assertions.assertThrows(ValidationException.class, () -> {
                    Users user = getUserFail();
                    user.setUserNm(null);
                    joinService.join(user);
                }),
                () -> Assertions.assertThrows(ValidationException.class, () -> {
                    Users user = getUserFail();
                    user.setUserNm("  ");
                    joinService.join(user);
                })
        );

//          두개 모두 실행되지 X
        /*
        assertThrows(ValidationException.class, () -> {
           Users user = getUserFail();
           joinService.join(user);
        });
        assertThrows(ValidationException.class, () -> {
            Users user = getUserFail();
            user.setUserId("  ");
            joinService.join(user);
        });

         */
    }

    @Test
    @DisplayName("userId는 6자리 이상 입력 검증, 실패시 ValidationException, 아이디는 6자리 이상 입력하세요")
    void userIdLengthCheckTest() {

    }

    @Test
    @Disabled
    @DisplayName("단위 테스트 연습")
    void testEx() {
//        assertTrue(joinService.join());
//        assertFalse(joinService.join());
//        fail();
    }

}
