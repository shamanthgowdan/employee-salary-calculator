
package maven_archetype_quickstart.maven_archetype_quickstart;

public class SalaryCalculator {

    public double calculateGrossSalary(
            double basicPay, double hra, double da) {

        if (basicPay < 0 || hra < 0 || da < 0) {
            throw new IllegalArgumentException(
                    "Salary components cannot be negative");
        }

        return basicPay + hra + da;
    }

    public double calculateNetSalary(
            double grossSalary, double deductions) {

        if (grossSalary < 0 || deductions < 0) {
            throw new IllegalArgumentException(
                    "Salary and deductions cannot be negative");
        }

        if (deductions > grossSalary) {
            throw new IllegalArgumentException(
                    "Deductions cannot exceed gross salary");
        }

        return grossSalary - deductions;
    }
}
