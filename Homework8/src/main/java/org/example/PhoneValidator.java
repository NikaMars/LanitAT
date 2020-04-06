package org.example;

import java.util.regex.Pattern;

public class PhoneValidator implements Validator {
    public boolean isValid(String value) {
        String code = "((\\([0-9]{3,4}\\))|([0-9]{3,4}))?-?";
        String mainPart = "[\\-0-9]{6,}";

//        String mainPartAll = "([0-9]{6,7})";
//        String mainPart2 = "([0-9]{2,3}-[0-9]{2}-[0-9]{2})";
//        String mainPart3 = "([0-9]{2}-[0-9]{2}-[0-9]{2,3})";
//        String mainPart4 = "([0-9]{2,3}-[0-9]{3,4})";
//        String mainPart = mainPartAll + "|" + mainPart2 + "|" + mainPart3 + "|" + mainPart4;

        String dop = "(добавочный |доб\\. )?";

        String pattern = "^[\\+]?[1-9]?-?" + code + mainPart + "(\\(" + dop + "[0-9]{2,3}\\))?$";
        return Pattern.matches(pattern, value);
    }
}
