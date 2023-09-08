import java.util.*;
import java.util.stream.*;
class Q6
{
	 public Map<String, Long> countNumberOfEmpoyeeInEachDepartment(List<Employee> employeeList)
	 {
		 Map<String, Long> departmentCounts = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		 return departmentCounts;
	 }

}