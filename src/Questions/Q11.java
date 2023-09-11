package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;
public class Q11
{
	 public Map<String, List<String>>  nameOfEachEmployeeInEachDepartment(List<Employee> employeeList)
	 {
		 return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
	 }

}