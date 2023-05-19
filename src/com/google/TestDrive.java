// Sort the employees in descending order of salary
package com.google;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Johny", 500));
		empList.add(new Employee(2, "Rocky", 1000));
		empList.add(new Employee(3, "Tim", 1500));
		empList.add(new Employee(4, "Alex", 2000));
		empList.add(new Employee(5, "Eric", 2500));
		empList.add(new Employee(6, "Daniel", 3000));
		empList.add(new Employee(7, "Leonel", 3500));
		
		empList.stream()
				.sorted((e1, e2) -> (int)(e2.getSalary() - e1.getSalary()))
//				.limit(3)	// top 3 salaried employee i.e. 3500, 3000 & 2500
				.skip(3) 	// salaries less than third highest i.e. 2000, 1500, 1000 & 500
				.forEach(System.out::println);
	}

}
