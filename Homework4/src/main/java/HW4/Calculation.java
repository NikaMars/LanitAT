package HW4;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     */
    // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.

    //Исправленный метод расчета скидки.
    public static double discount(double salary) {
        double disc = 0.00;
        if (salary < 5.0) { //"Скидка составляет - 30%"
            disc = 0.30;
        } else if (salary < 12.0) { //"Скидка составляет - 20%"
            disc = 0.20;
        } else if (salary < 15.0) { //"Скидка составляет - 15%"
            disc = 0.15;
        }
        return disc;
    }


    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount    - скидка
     * @return стоимость билета со скидкой
     */
    //Исправленный метод расчета стоимости билета со скидкой.
    public static double countTicketPrice(double ticketPrice, double discount) {
        if (ticketPrice > ticketPrice * discount) {
            double val = ticketPrice - ticketPrice * discount;
            return val;
        } else return 0;
    }
    // Метод должен корректно считать окончательную стоимость билета
}
