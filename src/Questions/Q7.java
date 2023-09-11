package Questions;

import Assignment.Employee;

import java.util.*;
import java.util.stream.*;
public class Q7
{
	 public Map<String, Double> averageSalaryOfEachDepartment(List<Employee> employeeList)
	 {
		return employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));
	 }

}