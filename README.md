Resource Scheduling & Capacity Analysis for Live Production Projects
Show Image
Show Image 
📋 Overview
This project models and analyzes workforce scheduling for a media production company that delivers live broadcast events such as sports, news, and entertainment shows. Since these projects operate on fixed schedules, effective resource allocation is critical to avoid conflicts, reduce overtime, and balance employee workload.
The solution focuses on logical problem modeling, basic scheduling, utilization analysis, and cost trade-offs, rather than heavy frameworks or premature optimization.

🎯 Problem Statement
The company executes approximately 100 live production projects per year. Each project:

Has a fixed date and time
Requires exactly 5 employees
Each employee must have a different skill

The workforce consists of 100 employees, each limited to 8 regular working hours per day, with overtime allowed at an increased cost.
The Challenge

Assign employees without double-booking
Balance workload across employees
Minimize unnecessary overtime
Evaluate whether the current workforce size is sufficient


🔑 Key Assumptions

Employees have a single primary skill
Projects have fixed durations
Employees can work on only one project at a time
Overtime is allowed but tracked separately
No absences or leaves are considered

These assumptions keep the model simple and focused on core logic.

📁 Project Structure
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
Module Descriptions
ModulePurposemodel/Core data structures (Employee, Project, Skill, TimeSlot)scheduler/Assignment logic and conflict detectionanalysis/Utilization tracking and cost calculationsMain.javaEntry point and simulation runner

✨ Features

✅ Skill-based employee assignment - Match employees to projects by required skills
✅ Conflict-free scheduling - Prevents double-booking across all time slots
✅ Regular vs overtime hour tracking - Distinguishes 8-hour regular from overtime
✅ Employee and team utilization calculation - Measures workforce efficiency
✅ Cost comparison between overtime and hiring - Data-driven staffing decisions
