package app.org.com.custom.annotation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FutureAndWithinSevenDaysValidator.class)
public @interface FutureAndWithinSevenDays {

	String message() default "The date should be future or within the seven days period.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
