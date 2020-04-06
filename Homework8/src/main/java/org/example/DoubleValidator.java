package org.example;

import java.util.regex.Pattern;

public class DoubleValidator implements Validator {

    /**
     * Получает на вход текст
     * Проверяет, является ли полученный текст double
     *
     * @param value
     * @return
     */
    public boolean isValid(String value) {
        String dot = "[\\.]?";
        String pattern = "^[\\+\\-]?[0-9_]*" + dot + "(([0-9_]*[0-9]d?$)|([0-9]*d?$))?";
        return Pattern.matches(pattern, value);
    }
}
