package com.file.resource.scheduler;

import com.file.resource.models.Employee;
import com.file.resource.models.Skill;
import com.file.resource.models.TimeSlot;

import java.util.List;

public class AvailabilityChecker {

    public static Employee findAvailableEmployee(
            List<Employee> employees,
            Skill requiredSkill,
            TimeSlot projectSlot) {
        for (Employee employee : employees) {
            if (employee.getSkill() == requiredSkill &&
                    employee.isAvailable(projectSlot)) {

                return employee;
            }
        }
        return null;
    }
}