package HW3;

public class TestEmployeeCard {

    public void testEmployeeCard() {
        String name = "Иван";
        int age = 25;
        double effective = 1.0;
        double salary = 15.3;
        boolean isWoman = false;
        EmployeeCard employeeCard1 = new EmployeeCard(name, age, effective, isWoman);
        EmployeeCard employeeCard2 = new EmployeeCard(name, effective, salary, isWoman);
        //Создание объекта с вызовом исправленного конструктора
        EmployeeCard employeeCard3 = new EmployeeCard(name, age, effective, salary, isWoman);
        System.out.println("\nТестирование метода EmployeeCard.toString:");
        System.out.println("\nТестовые данные:\n" + "Имя работника - " + name + ". Его возраст - " + age + " лет. Очки эффективности - " + effective
                + ". Его зарплата - " + salary + " в час. Пол женский - " + isWoman);
        System.out.println(employeeCard1.toString() + "\n" + employeeCard2.toString());
        System.out.println("Исправленный метод EmployeeCard.toString:\n" + employeeCard3.toString2());

        name = "Мария";
        age = 20;
        effective = 7.0;
        salary = 57.8;
        isWoman = true;
        EmployeeCard employeeCard4 = new EmployeeCard(name, age, effective, isWoman);
        EmployeeCard employeeCard5 = new EmployeeCard(name, effective, salary, isWoman);
        //Создание объекта с вызовом исправленного конструктора
        EmployeeCard employeeCard6 = new EmployeeCard(name, age, effective, salary, isWoman);
        System.out.println("\nТестовые данные:\n" + "Имя работника - " + name + ". Его возраст - " + age + " лет. Очки эффективности - " + effective
                + ". Его зарплата - " + salary + " в час. Пол женский - " + isWoman);
        System.out.println(employeeCard4.toString() + "\n" + employeeCard5.toString());
        System.out.println("Исправленный метод EmployeeCard.toString:\n" + employeeCard6.toString2());

    }

}
