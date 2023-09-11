package Questions;

import Assignment.Employee;

import java.util.*;
public class Q8
{
	 public Optional<Employee> youngestMaleEmployeeInProductDevelopmentDepartment(List<Employee> employeeList)
	 {
		return employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("Product Development"))
                .filter(employee -> employee.getGender().equals("Male"))
                .min(Comparator.comparingInt(Employee::getAge));
	 }

}