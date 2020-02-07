package com.accenture.lkm.validator;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
//@Constraint(validatedBy = CustomerNameValidator.class) //Related Validator
//@Target( { ElementType.METHOD, ElementType.FIELD })// Describes the placement of  the annotation whether it can come at instance variable or method level
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerNameValidatorVal {
   String message() default "{CustomerNameValidatorVal}"; // key to give message
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
//http://www.java2novice.com/java-annotations/retention-policy/