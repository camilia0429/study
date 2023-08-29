package exam02.config;

import exam02.aopex.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configurable
//@EnableAspectJAutoProxy // 인터페이스 기반의 프록시(표준)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {

    @Bean
    public ProxyCalculator proxyCalculator() {
        return new ProxyCalculator();
    }
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
    @Bean
    public ProxyCache proxyCache() {
        return new ProxyCache();
    }
}
