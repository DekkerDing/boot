package io.github.DekkerDing.ecommerce.domain.annotation;

import io.github.DekkerDing.ecommerce.domain.model.Marke;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({Marke.class})
public @interface EnableECommerce {
}
