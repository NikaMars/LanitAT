package HW4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEmployeeCard {
    @Test(priority = 11)
    public void testEmployeeCard() {
        System.out.println("\nТестирование методов класса EmployeeCard:\n");
        System.out.println("Тестирование метода EmployeeCard.toString:");
    }

    /**
     * name - имя
     * age - возраст
     * effective - очки эффективности
     * salary - зарплата
     * Пол работника, true - женщина, false - мужчина
     */
    @DataProvider
    public Object[][] employeeCardDataProvider() {
        return new Object[][]{
                {"Иван", 25, 1.0, 15.3, false},
                {"Мария", 20, 7.0, 47.8, true},
                {"Оля", 45, 6.5, 23.0, true},
                {"Виктория", 26, 3.9, 35.0, false},
        };
    }


    @Test(dataProvider = "employeeCardDataProvider",
            priority = 12)
    public void testToString(String name, int age, double effective, double salary, boolean isWoman) {
        //Создание объекта с вызовом исправленного конструктора
        EmployeeCard employeeCard = new EmployeeCard(name, age, effective, salary, isWoman);
        String sex = isWoman ? "Женский" : "Мужской";
        String s = "Имя работника - " + name + ". Его возраст - " + age + " лет. Очки эффективности - "
                + effective + ". Его зарплата - " + salary + " в час. Пол - " + sex;
        Assert.assertEquals(employeeCard.toString(), s, "Тест не пройден");
        System.out.println("Тест пройден. Фактический результат данные сотрудника:\n" + s);
    }
}