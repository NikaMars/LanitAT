import HW4.IndividualWork;

import org.testng.annotations.Test;

public class TestIndividualWork {

    @Test(priority = 20)
    public void testEmployeeCard() {
        System.out.println("\nТестирование методов класса IndividualWork:");
    }

    @Test(priority = 21)
    public void testIndividualWork() {
        System.out.println("\nВывод таблицы умножения:");
        IndividualWork.table();
    }
}
