import java.util.*;
import java.util.stream.*;

class Q2
{
 public List<String>	 printNameOfAllDepartment(List<Employee> employeeList)
 {
	List<String> departments = employeeList.stream()
                .map(Employee::getDepartment)          // Extract city names
                .distinct()                     // Remove duplicates
                .collect(Collectors.toList());
	return departments;
 }
}