package app.org.com.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FutureAndWithinSevenDaysValidator implements ConstraintValidator<FutureAndWithinSevenDays, String> {

    @Override
    public final boolean isValid(final String value, final ConstraintValidatorContext context) {

    	System.out.println("FutureAndWithinSevenDaysValidator.class");
        if (value != null) {
            LocalDate formattedDate = LocalDate.parse(value, DateTimeFormatter.BASIC_ISO_DATE);
            long day = ChronoUnit.DAYS.between(LocalDate.now(), formattedDate);
            return formattedDate.isAfter(LocalDate.now()) && day <= 7;
        }

        return false;
    }

}
