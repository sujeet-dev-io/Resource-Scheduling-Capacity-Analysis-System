 # Resource Scheduling & Capacity Analysis for Live Production Projects

## Overview

This project models and analyzes workforce scheduling for a media production company that delivers live broadcast events such as sports, news, and entertainment shows. Since these projects operate on fixed schedules, effective resource allocation is critical to avoid conflicts, reduce overtime, and balance employee workload.

The solution focuses on logical problem modeling, basic scheduling, utilization analysis, and cost trade-offs, rather than heavy frameworks or premature optimization.

---

## Problem Statement

The company executes approximately **100 live production projects per year**.

Each project:
- Has a fixed date and time
- Requires exactly **5 employees**
- Each employee must have a **different skill**

The workforce consists of **100 employees**, where:
- Each employee can work up to **8 regular hours per day**
- Work beyond this limit is considered **overtime** and incurs a higher cost

The key challenges are:
- Assigning employees without double-booking
- Balancing workload across employees
- Minimizing unnecessary overtime
- Evaluating whether the current workforce size is sufficient

---

## Key Assumptions

To keep the model simple and focused on core logic, the following assumptions are made:

- Employees have a single primary skill
- Projects have fixed durations
- Employees can work on only one project at a time
- Overtime is allowed but tracked separately
- No absences or leaves are considered

---

## System Architecture

The solution follows a modular and layered system architecture, separating domain modeling, scheduling logic, and analytical components.

### Architecture Reference

- 📄 **Resource Scheduling System Architecture (PDF)**
-   [Resource Scheduling System Architecture.pdf](https://github.com/user-attachments/files/24420322/Resource.Scheduling.System.Architecture.pdf)

- 🖼️ **System Architecture Diagram (Image)**
- <img width="4852" height="12665" alt="System Architecture Diagram" src="https://github.com/user-attachments/assets/b10876db-b563-4b8a-886a-49a60ded072a" />


### Architecture Overview

- **Model Layer**  
  Represents core business entities such as employees, projects, skills, and time slots

- **Scheduling Layer**  
  Handles employee availability checks and conflict-free assignment

- **Analysis Layer**  
  Computes utilization metrics and compares overtime versus hiring costs

- **Application Layer**  
  Drives the simulation and integrates all system components

This architecture ensures clear separation of concerns, readability, and extensibility.

---

## Project Structure

```text
src/
 ├── model/
 │    ├── Employee.java
 │    ├── Project.java
 │    ├── Skill.java
 │    └── TimeSlot.java
 ├── scheduler/
 │    ├── Scheduler.java
 │    └── AvailabilityChecker.java
 ├── analysis/
 │    ├── UtilizationCalculator.java
 │    └── CostCalculator.java
 └── Main.java
