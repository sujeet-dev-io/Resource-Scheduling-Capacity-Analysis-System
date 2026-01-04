package com.file.resource.scheduler;

import com.file.resource.models.Employee;
import com.file.resource.models.Project;
import com.file.resource.models.Skill;
import com.file.resource.models.TimeSlot;

import java.util.List;

public class Scheduler {

    public boolean scheduleProject(Project project, List<Employee> employees) {
        TimeSlot projectSlot = project.getTimeSlot();
        for (Skill skill : Skill.values()) {
            Employee employee = AvailabilityChecker.findAvailableEmployee(
                    employees,
                    skill,
                    projectSlot
            );
            if (employee == null) {
                System.out.println(
                        "Scheduling failed for Project " + project.getId()
                                + " | Skill missing: " + skill
                );
                return false;
            }
            // Assign employee
            employee.assign(projectSlot);
            project.assignEmployee(skill, employee);
        }
        return true;
    }

    public void scheduleAllProjects(
            List<Project> projects,
            List<Employee> employees) {
        for (Project project : projects) {
            boolean success = scheduleProject(project, employees);

            if (success) {
                System.out.println(
                        "Project " + project.getId() + " scheduled successfully."
                );
            }
        }
    }
}
