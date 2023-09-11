package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;
public class Q6
{
	 public Map<String, Long> countNumberOfEmpoyeeInEachDepartment(List<Employee> employeeList)
	 {
		 return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	 }

}