package Questions;

import Assignment.Employee;

import java.util.*;
public class Q9
{
	 public HashMap<String,Long> howManyMaleAndFemaleEmployeeInSalesAndMarketingTeam(List<Employee> employeeList)
	 {
		long maleCount = employeeList.stream()
                .filter(employee -> "Sales And Marketing".equals(employee.getDepartment()) && "Male".equals(employee.getGender()))
                .count();

        long femaleCount = employeeList.stream()
                .filter(employee -> "Sales And Marketing".equals(employee.getDepartment()) && "Female".equals(employee.getGender()))
                .count();
				
		HashMap<String,Long> hm=new HashMap<>();
		hm.put("Male",maleCount);
		hm.put("Female",femaleCount);
		
		return hm;
	 }

}