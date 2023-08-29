package exam04.main;

import exam04.config.AppCtx;
import exam04.members.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        ListService listService = ctx.getBean(ListService.class);

        Users user= new Users();
        user.setUserId("user01");
        user.setUserNm("사용자01");
        user.setUserPw("1234");
        user.setRegDt(LocalDateTime.now());
        joinService.join(user);

        listService.print();

        ctx.close();
    }
}
