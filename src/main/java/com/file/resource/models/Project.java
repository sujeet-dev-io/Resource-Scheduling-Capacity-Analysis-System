package com.file.resource.models;


import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class Project {

    private final int id;
    private final TimeSlot timeSlot;

    // Skill → Employee mapping
    private final Map<Skill, Employee> assignedEmployees;

    public Project(int id, TimeSlot timeSlot) {
        this.id = id;
        this.timeSlot = timeSlot;
        this.assignedEmployees = new HashMap<>();
    }

    public void assignEmployee(Skill skill, Employee employee) {
        assignedEmployees.put(skill, employee);
    }

    public boolean isFullyAssigned() {
        return assignedEmployees.size() == Skill.values().length;
    }
}
