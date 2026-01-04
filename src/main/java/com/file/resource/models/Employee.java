package com.file.resource.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Employee {

    private final int id;
    private final Skill skill;

    private int regularHours;
    private int overtimeHours;

    private final List<TimeSlot> assignedTimeSlots;

    public Employee(int id, Skill skill) {
        this.id = id;
        this.skill = skill;
        this.regularHours = 0;
        this.overtimeHours = 0;
        this.assignedTimeSlots = new ArrayList<>();
    }


    public int getTotalHours() {
        return regularHours + overtimeHours;
    }

    public boolean isAvailable(TimeSlot slot) {
        for (TimeSlot assigned : assignedTimeSlots) {
            if (assigned.overlaps(slot)) {
                return false;
            }
        }
        return true;
    }

    public void assign(TimeSlot slot) {
        int duration = slot.getDuration();

        if (regularHours < 8) {
            int remainingRegular = 8 - regularHours;
            if (duration <= remainingRegular) {
                regularHours += duration;
            } else {
                regularHours += remainingRegular;
                overtimeHours += (duration - remainingRegular);
            }
        } else {
            overtimeHours += duration;
        }
        assignedTimeSlots.add(slot);
    }
}