package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidatorTest {
    @DataProvider
    public static Object[][] doubleData() {
        return new Object[][]{
                {"1.", true},
                {"-1.", true},
                {"1.0", true},
                {"1000.000d", true},
                {"1d", true},
                {"+001.", true},
                {"-.0", true},
                {"0.", true},
                {"+0.000", true},
                {"-0d", true},
                {"0__00.0_00", true},
                {"+.0_", false},
                {"+-1", false},
                {"0,000", false},
                {"5L", false},
                {"1-, 8.+1", false},
                {"2_000_00.(6)", false},

        };
    }

    @Test(dataProvider = "doubleData")
    public void doubleTest(String value, boolean expectedValidity) {
        final boolean actualValidity = new DoubleValidator().isValid(value);
        Assert.assertEquals(actualValidity, expectedValidity, "Double value: " + value);
    }

    @DataProvider
    public static Object[][] phoneData() {
        return new Object[][]{
                {"557777", true},
                {"55-77-55", true},
                {"222-222", true},
                {"495-5552211", true},
                {"(495)55-22-113", true},
                {"+7(424)452-1245", true},
                {"8-495-211-21-21", true},
                {"+3(2445)24-4244", true},
                {"84952211242", true},
                {"555777(424)", true},
                {"(495)242-4542(добавочный 443)", true},
                {"+7(495)242-4542(доб. 12)", true},
                {"-3(124)1211236", false},
                {"25452", false},
                {"(495)242-4542(нет)", false},
                {"54524537", false},
                {"245O76", false},
                {"25l756", false},
                {"54524537", false},
                {"8495702", false},
                {"8(541)(124)42431", false}

        };
    }

    @Test(dataProvider = "phoneData")
    public void phoneTest(String value, boolean expectedValidity) {
        final boolean actualValidity = new PhoneValidator().isValid(value);
        Assert.assertEquals(actualValidity, expectedValidity, "Phone value: " + value);
    }
}
