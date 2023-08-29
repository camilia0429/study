package exam01.config;

import exam01.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정정보를 전달
public class AppCtx {

    @Bean // 스프링 관리 객체
    public Hello hello() {
        return new Hello();
    }
}
