package exam01;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({METHOD,FIELD,TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] value() default {"값1","값2"};

    int min() default 0;
    int max() default 100;

}
