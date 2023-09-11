package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;

public class Q2
{
 public List<String>	 printNameOfAllDepartment(List<Employee> employeeList)
 {
	return employeeList.stream()
                .map(Employee::getDepartment)          // Extract city names
                .distinct()                     // Remove duplicates
                .collect(Collectors.toList());
 }
}