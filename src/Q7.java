import java.util.*;
import java.util.stream.*;
class Q7
{
	 public Map<String, Double> averageSalaryOfEachDepartment(List<Employee> employeeList)
	 {
		 Map<String, Double> averageSalaryByDepartment = employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));
		 return averageSalaryByDepartment;
	 }

}