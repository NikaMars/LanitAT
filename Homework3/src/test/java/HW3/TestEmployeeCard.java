package HW3;

import HW3.EmployeeCard;

public class TestEmployeeCard {

    public void testEmployeeCard() {
        String name = "Иван";
        int age = 25;
        double effective = 0.0;
        double salary = 15.3;
        boolean isWoman = true;
        EmployeeCard employeeCard1 = new EmployeeCard(name, age, effective, isWoman);
        isWoman = false;
        EmployeeCard employeeCard2 = new EmployeeCard(name, effective, salary, isWoman);
        System.out.println("Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - "
                + salary + " в час. Пол - Женский");
        System.out.println(employeeCard1.toString() + "\n" + employeeCard2.toString());

        name = "Мария";
        age = 20;
        effective = 7.0;
        salary = 57.8;
        isWoman = false;
        EmployeeCard employeeCard3 = new EmployeeCard(name, age, effective, isWoman);
        isWoman = true;
        EmployeeCard employeeCard4 = new EmployeeCard(name, effective, salary, isWoman);
        System.out.println("Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - "
                + salary + " в час. Пол - мужской");
        System.out.println(employeeCard3.toString() + "\n" + employeeCard4.toString());
    }

}
