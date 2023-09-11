package Questions;

import Assignment.Employee;

import java.util.*;
public class Q3
{
	 public HashMap<String,OptionalDouble> averageAgeOfMaleAndFemale(List<Employee> employeeList)
	 {
		OptionalDouble averageMaleEmployees = employeeList.stream()
                .filter(employee -> "Male".equals(employee.getGender()))
                .mapToInt(Employee::getAge)
                .average();
				
		OptionalDouble averageFemaleEmployees = employeeList.stream()
                .filter(employee -> "Female".equals(employee.getGender()))
                .mapToInt(Employee::getAge)
                .average();
			   
		HashMap<String,OptionalDouble> hm=new HashMap<>();
		hm.put("Male",averageMaleEmployees);
		hm.put("Female",averageFemaleEmployees);
		
		return hm;
	 }

}