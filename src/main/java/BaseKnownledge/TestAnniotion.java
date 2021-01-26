package BaseKnownledge;

import java.lang.annotation.*;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/12 18:18
 * @describe 注解是均集成了接口Anniotion,注解的作用是用来进行描述，被注解的方法或者类在编译或者运行时要进行的行为。
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TestAnniotion {
}
