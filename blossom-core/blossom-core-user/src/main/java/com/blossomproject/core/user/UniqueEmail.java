package com.blossomproject.core.user;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqueEmail {
  String message() default "{users.user.validation.email.UniqueEmail.message}";

  Class<?>[] groups() default {};

  String idField() default "";

  String field() default "email";

  Class<? extends Payload>[] payload() default {};
}
