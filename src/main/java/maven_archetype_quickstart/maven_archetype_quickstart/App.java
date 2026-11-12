
package maven_archetype_quickstart.maven_archetype_quickstart;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("EMPLOYEE SALARY CALCULATOR");

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Total Deductions: ");
        double deductions = sc.nextDouble();

        try {
            double gross = calculator.calculateGrossSalary(
                    basic, hra, da);

            double net = calculator.calculateNetSalary(
                    gross, deductions);

            System.out.println("\n----- SALARY DETAILS -----");
            System.out.println("Employee Name: " + name);
            System.out.println("Basic Pay: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + gross);
            System.out.println("Deductions: " + deductions);
            System.out.println("Net Salary: " + net);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
