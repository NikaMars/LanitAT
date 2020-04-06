package org.example;

/**
 * Задание на субботу: реализовать при помощи регулярного выражения классы-валидаторы.
 * Сейчас там всегда возвращается false.
 * Ваша задача, чтобы возвращалось правильно и все юнит-тексты там образом проходили
 */

public class RegexpExample {
    private static final String digit = "23423";
    private static final String word = "awesome";
    private static final String birthCert = "IНЮ123112";
    private static final String snils = "0000 0000 0000 0000";
    private static final String text = "Здравствуйте, меня зовут Василий и мне необходимо с вами переговорить\n" +
            "по поводу автомобиля с заводским номером A333BO99. Я писал вам на moneyhunter@yandex.ru, но ответа не получил\n" +
            "Мой телефон: (343)577-0140.\n" +
            "А электронная почта vasiliy.bestolkovy@mail.ru. А пароль qwerty. И номер карточки, где деньги лежат\n" +
            "452345243563245";

    public static void main(String[] args) {
//    Character classes
//        ., matches any character except line breaks. Equivalent to [^\n\r].
//        \w, matches any word character (alphanumeric & underscore). Only matches low-ascii characters (no accented or non-roman characters). Equivalent to [A-Za-z0-9_]
//        \d, matches any digit character (0-9). Equivalent to [0-9].
//        \s, matches any whitespace character (spaces, tabs, line breaks).
//        [ABC], matches any character in the set.
//        [^ABC], matches any character is not in the set.
//        [A-Z], matches a character having a character code between the two specified characters inclusive.

//     Quantifiers & Alternation
//        +, matches 1 or more of the preceding token.
//        *, matches 0 or more of the preceding token.
//        {1,3}, matches the specified quantity of the previous token. {1,3} will match 1 to 3. {3} will match exactly 3. {3,} will match 3 or more.
//        ?, matches 0 or 1 of the preceding token, effectively making it optional.
//        +?, *? and ??, are equal to the preceding quantifiers, but make them lazy causing it to match as few characters as possible. By default, quantifiers are greedy, and will match as many characters as possible.
//        |, acts like a boolean OR. Matches the expression before or after the |. It can operate within a group, or on a whole expression. The patterns will be tested in order.
        ///// String.matches()
        // todo провалидировать, что didgit -- число
        // todo word содержит только буквы
        // todo word не содержит заглавных букв
        // todo word не содержит пробелов
//        System.out.println(text.matches(".*"));

        ///// ReplaceAll
        // todo скрыть длинные номера
        // todo скрыть email-адреса


//    Anchors
//        ^, matches the beginning of the string, or the beginning of a line if the multiline flag (m) is enabled. This matches a position, not a character.
//        $, matches the end of the string, or the end of a line if the multiline flag (m) is enabled. This matches a position, not a character.
//        \b, matches a word boundary position such as whitespace, punctuation, or the start/end of the string. This matches a position, not a character.
//        \B, matches any position that is not a word boundary. This matches a position, not a character.
        // todo вывести строки, начинающиеся с цифр из text
        // todo вывести все слова по 1 на строку, за исключением слов, содержащих цифры
        // pattern

//    Groups & Lookaround
//        (ABC), groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.
//        \1, matches the results of a previous capture group. For example \1 matches the results of the first capture group and \3 matches the third.
//        (?:ABC), groups multiple tokens together without creating a capture group.
//        (?=ABC), matches a group after the main expression without including it in the result.
//        (?!ABC), specifies a group that can not match after the main expression (if it matches, the result is discarded).
        // todo вывести имя
        // todo вывести телефон


    }
}
