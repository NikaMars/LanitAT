import HW3.Calculation;

public class TestCalculation {
    //Исправленный метод расчета скидки.
    public static void cordiscount(double salary) {
        if (salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
        } else if (salary < 12.0) {
            System.out.println("Скидка составляет - 20%");
        } else if (salary < 15.0) {
            System.out.println("Скидка составляет - 15%");
        } else
        System.out.println("Скидки не будет!");
    }

    //Исправленный метод расчета стоимости билета со скидкой.
    public static double countTicketPrice2 (int ticketPrice, double discount){
        if (ticketPrice > discount) {
            return ticketPrice - discount;
        }
        else return 0;
    }

    public void testCalculation() {
        double d = 3.0;
        System.out.println("Тестирование метода testCalculation");
        System.out.println("Для зарплаты " + d + ":");
        Calculation.discount(d);

        System.out.println("\n Исправленный метод testCalculation");
        System.out.println("Для зарплаты " + d + ":");
        TestCalculation.cordiscount(d);

        int p = 10;
        double dis1 = 15;
        double dis2 = 2;
        System.out.println("\n Тестирование метода countTicketPrice");
        System.out.println("Цена " + p + ". Размер скидки " + dis1 + ". Окончательная стоимость: ");
        System.out.println(Calculation.countTicketPrice(p, dis1));

        System.out.println("\n Исправленный метод countTicketPrice");
        System.out.println("Цена " + p + ". Размер скидки " + dis1 + ". Окончательная стоимость: ");
        System.out.println(TestCalculation.countTicketPrice2(p, dis1));

        System.out.println("Цена " + p + ". Размер скидки " + dis2 + ". Окончательная стоимость: ");
        System.out.println(TestCalculation.countTicketPrice2(p, dis2));
    }
}
