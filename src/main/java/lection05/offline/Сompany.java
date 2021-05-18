package lection05.offline;

import java.util.Random;

public class Сompany {

    public static void main(String[] args) {
        Employee employeeTask4 = new Employee("Сапёлкин Андрей Владимирович", "Старший ИТ инженер",
                "+7(926)111-22-33", 70000, 34);

        System.out.println(employeeTask4.getFio() + ": " + employeeTask4.getPosition());

        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Иванов Иван Иванович", "Менеджер",
                "+7(111)111-11-11", 100000, 25);
        employee[1] = new Employee("Петров Петр Петрович", "Директор",
                "+7(222)222-22-22", 150000, 55);
        employee[2] = new Employee("Сидорова Анна Владимировна", "Бухгалтер",
                "+7(333)333-33-33", 110000, 45);
        employee[3] = new Employee("Антонов Антон Антонович", "Курьер",
                "+7(444)444-44-44", 50000, 31);
        employee[4] = new Employee("Пименова Анна Сергеевна", "Руководитель службы кадров",
                "+7(555)555-55-55", 90000, 59);

        for (Employee value : employee) {
            if (value.getAge() > 40)
                value.printEmployeeInfo();
        }

        for (Employee value : employee) {
            value.salaryIncrease();
        }

        for (Employee value : employee) {
                value.printEmployeeInfo();
        }



    }
}
