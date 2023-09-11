package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;
public class Q13
{
	 public List<Employee> employeeAgeLessThan26Year(List<Employee> employeeList)
	 {
		return employeeList.stream()
                .filter(employee -> employee.getAge() < 26)
                .collect(Collectors.toList());
	 }

}