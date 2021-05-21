import java.lang.annotation.*;

/**
 * @author ChenWei
 * @create 2021-05-15-13:26
 */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AAA {

    boolean mustLogin() default false;
}
