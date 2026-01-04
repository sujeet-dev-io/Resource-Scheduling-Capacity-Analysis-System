package com.file.resource.analysis;

import com.file.resource.models.Employee;

import java.util.List;

public class UtilizationCalculation {
    private static final int WEEKLY_AVAILABLE_HOURS = 40; // 8h × 5 days

    public static double calculateEmployeeUtilization(Employee employee) {
        int workedHours = employee.getTotalHours();
        return (double) workedHours / WEEKLY_AVAILABLE_HOURS;
    }

    public static double calculateTeamUtilization(List<Employee> employees) {
        int totalWorkedHours = 0;
        int totalAvailableHours = employees.size() * WEEKLY_AVAILABLE_HOURS;

        for (Employee employee : employees) {
            totalWorkedHours += employee.getTotalHours();
        }
        return (double) totalWorkedHours / totalAvailableHours;
    }

    public static void printUtilizationReport(List<Employee> employees) {
        for (Employee employee : employees) {
            double utilization = calculateEmployeeUtilization(employee);
            System.out.printf(
                    "Employee %d (%s) Utilization: %.2f%%%n",
                    employee.getId(),
                    employee.getSkill(),
                    utilization * 100
            );
        }

        double teamUtilization = calculateTeamUtilization(employees);
        System.out.printf(
                "Overall Team Utilization: %.2f%%%n",
                teamUtilization * 100
        );
    }
}

