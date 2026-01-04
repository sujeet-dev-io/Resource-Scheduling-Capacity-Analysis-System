package com.file.resource.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlot {

    private int day;
    private int startHour;
    private int endHour;

    public int getDuration() {
        return endHour - startHour;
    }

    public boolean overlaps(TimeSlot other) {
        if (this.day != other.day) {
            return false;
        }
        return this.startHour < other.endHour && this.endHour > other.startHour;
    }

}
