package org.ananta.itCompany;

import org.ananta.itCompany.employee.Designer;
import org.ananta.itCompany.employee.Developer;
import org.ananta.itCompany.employee.Employee;
import org.ananta.itCompany.employee.Manager;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Developer(
                        "John", "Smith", 29, 6000,
                        new String[]{"Java", "Git", "Maven"}, "MacOS"),

                new Manager("John", "Smith", 29, 6000,
                        false, true),

                new Designer("John", "Smith", 29, 6000,
                        new String[]{"Mobile design", "Photoshop", "Sketch"}, "Macbook PRO Over 9000")
        };

        for (Employee employee : employees) {
            employee.work();

            if (employee instanceof Developer) {
                System.out.println("Я - " + Developer.class.getSimpleName());
                ((Developer) employee).drinkCoffie();
            }

            if (employee instanceof Manager) {
                System.out.println("Я - " + Manager.class.getSimpleName());
                ((Manager) employee).launchMeeting();
            }

            if (employee instanceof Designer) {
                System.out.println("Я - " + Designer.class.getSimpleName());
                ((Designer) employee).showSketches();
            }

            System.out.println();
        }
    }
}
