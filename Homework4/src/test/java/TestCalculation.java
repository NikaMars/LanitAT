import HW4.Calculation;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

public class TestCalculation {

    private DecimalFormat df = new DecimalFormat("#.##");

    @Test(priority = 1)
    public void testCalculation() {
        System.out.println("\nТестирование методов класса Calculation:\n");
    }

    @Test (priority = 4)
//    @BeforeGroups(groups ="discount")
    public void discountInfo() {
        System.out.println("\nТестирование метода discount:");
    }

    @Test (priority = 9)
//    @BeforeGroups(groups ="countTicket")
    public void countTicketInfo() {
        System.out.println("\nТестирование метода countTicketPrice:");
    }


    /*
     *Передаваемые параметры: зарплата и размер скидки в дробном представлении
     */
    @DataProvider
    public Object[][] discountDataProvider() {
        return new Object[][]{
                {4.0, 0.30}, // ЗП < 5, скидка - 30%
                {7.0, 0.20}, // ЗП < 12, скидка - 20%
                {12.0, 0.15}, // ЗП < 15, скидка - 15%
                {17.0, 0.0}, // ЗП >= 15, скидка - 0%
        };
    }


    /*
     *Передаваемые параметры: цена билета и размер скидки в в дробном представлении
     */
    @DataProvider
    public Object[][] countTicketPriceDataProvider() {
        return new Object[][]{
                {10.0, 0.30, 7.0},
                {10.0, 0.50, 5.0},
                {10.0, 1.15, 0},
                {10.0, 0.0, 10.0},
        };
    }


    @Test(dataProvider = "discountDataProvider",
            groups = "discount",
            priority = 5)
    public void testDiscount(double salary, double disc) {
        System.out.println("Расчет скидка при ЗП = " + salary + " $/час:");
        Assert.assertEquals(Calculation.discount(salary), disc, "Тест не пройден");
        System.out.println("Тест успешно пройден. Ожидаемый результат - " + Calculation.discount(salary) +
                "% | Фактический результат - " + disc + "%");
    }


    @Test(dataProvider = "countTicketPriceDataProvider",
            groups = "countTicket",
            priority = 10)
    public void testCountTicketPrice(double ticketPrice, double discount, double val) {
        System.out.println("Расчет цены со скидкой " + df.format(discount * 100) +
                " % от первоначальной цены " + ticketPrice);
        Assert.assertEquals(Calculation.countTicketPrice(ticketPrice, discount), val, "Тест не пройден");
        System.out.println("Тест успешно пройден. Ожидаемый результат - " +
                Calculation.countTicketPrice(ticketPrice, discount) +
                " | Фактический результат - " + discount);
    }
}
