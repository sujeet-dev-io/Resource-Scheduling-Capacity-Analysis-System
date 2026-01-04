package com.file.resource;

import com.file.resource.analysis.CostCalculation;
import com.file.resource.analysis.UtilizationCalculation;
import com.file.resource.models.Employee;
import com.file.resource.models.Project;
import com.file.resource.models.Skill;
import com.file.resource.models.TimeSlot;
import com.file.resource.scheduler.Scheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ResourceSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceSchedulingApplication.class, args);

 		// 1. Create Employees
		List<Employee> employees = new ArrayList<>();
		int id = 1;
		// Create 20 employees for each skill = 100 total
		for (Skill skill : Skill.values()) {
			for (int i = 0; i < 20; i++) {
				employees.add(new Employee(id++, skill));
			}
		}
		System.out.println("Total Employees: " + employees.size());

 		// 2. Create Projects
 		List<Project> projects = new ArrayList<>();
		// Create 10 sample projects (each 4 hours)
		projects.add(new Project(1, new TimeSlot(1, 10, 14)));


		System.out.println("Total Projects: " + projects.size());

 		// 3. Run Scheduler
 		Scheduler scheduler = new Scheduler();
		scheduler.scheduleAllProjects(projects, employees);

 		// 4. Utilization Analysis
 		System.out.println("\n--- UTILIZATION REPORT ---");
		UtilizationCalculation.printUtilizationReport(employees);

 		// 5. Cost Analysis
 		System.out.println("\n--- COST REPORT ---");
		CostCalculation.printCostReport(employees);

		System.out.println("\nScheduling & analysis completed successfully.");
	}

}
