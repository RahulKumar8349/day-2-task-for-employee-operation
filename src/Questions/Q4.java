package Questions;

import Assignment.Employee;

import java.util.*;
public class Q4
{
	 public Optional<Employee> highestPaidEmployee(List<Employee> employeeList)
	 {
		 return employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
	 }

}