package com.example.zhouwei.config.ar;

import java.lang.annotation.*;

/**
 * Created by zhouwei on 2017/3/30.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SessionUser {
    String value() default "";
}
