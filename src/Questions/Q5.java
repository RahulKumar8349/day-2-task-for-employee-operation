package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;
public class Q5
{
	 public List<Employee> nameOfEmployeesJoinAfter2015(List<Employee> employeeList)
	 {
		 return employeeList.stream()
                .filter(employee -> employee.getyearOfJoining() > 2015)
                .collect(Collectors.toList());
	 }

}