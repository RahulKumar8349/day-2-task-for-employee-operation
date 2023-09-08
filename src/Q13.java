import java.util.*;
import java.util.stream.*;
class Q13
{
	 public List<Employee> employeeAgeLessThan26Year(List<Employee> employeeList)
	 {
		List<Employee> youngEmployees = employeeList.stream()
                .filter(employee -> employee.getAge() < 26)
                .collect(Collectors.toList());
		return youngEmployees;
	 }

}