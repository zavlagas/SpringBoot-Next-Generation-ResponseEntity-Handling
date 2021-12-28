package com.app.scheduler.manager.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface Advisor {

    @AliasFor(
            annotation = Service.class
    )
    String value() default "";
}
