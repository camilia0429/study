package exam03.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1)
@Aspect
public class CacheCalculator {

    private Map<Long,Object> cache = new HashMap<>();

    @Pointcut("execution(* exam03.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        if(cache.containsKey(num)) {
            System.out.println("캐시사용");
            return cache.get(num);
        }

        Object result = joinPoint.proceed(); // factorial 프록시
        cache.put(num, result);

        return result;
    }
}
