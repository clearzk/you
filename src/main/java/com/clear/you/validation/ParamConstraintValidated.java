package com.clear.you.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParamConstraintValidated implements ConstraintValidator<DateValid,String> {

    private static final String reg="^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern=Pattern.compile(reg);
        if (value != null) {
            Matcher matcher = pattern.matcher(value);
            return matcher.find();
        }
        return true;
    }


}
