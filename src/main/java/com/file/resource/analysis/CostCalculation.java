package com.file.resource.analysis;

import com.file.resource.models.Employee;

import java.util.List;

public class CostCalculation {

    private static final double REGULAR_COST = 1.0;
    private static final double OVERTIME_COST = 1.3;

    public static double calculateEmployeeCost(Employee employee) {
        double regularCost = employee.getRegularHours() * REGULAR_COST;
        double overtimeCost = employee.getOvertimeHours() * OVERTIME_COST;
        return regularCost + overtimeCost;
    }

    public static double calculateTotalCost(List<Employee> employees) {
        double totalCost = 0.0;

        for (Employee employee : employees) {
            totalCost += calculateEmployeeCost(employee);
        }

        return totalCost;
    }

    public static void printCostReport(List<Employee> employees) {
        for (Employee employee : employees) {
            double cost = calculateEmployeeCost(employee);
            System.out.printf(
                    "Employee %d | Regular: %d h | Overtime: %d h | Cost: %.2f%n",
                    employee.getId(),
                    employee.getRegularHours(),
                    employee.getOvertimeHours(),
                    cost
            );
        }

        double totalCost = calculateTotalCost(employees);
        System.out.printf("Total Labor Cost: %.2f units%n", totalCost);
    }
}
