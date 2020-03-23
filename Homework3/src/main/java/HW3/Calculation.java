package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     */
    public static void discount(double salary) {
        if (salary < 15.0) {
            System.out.println("Скидка составляет - 15%");
        } else if (salary < 12.0) {
            System.out.println("Скидка составляет - 20%");
        } else if (salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
        }
        System.out.println("Скидки не будет!");
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.
    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount){
        return ticketPrice - discount;
    }
    // Метод должен корректно считать окончательную стоимость билета
}
