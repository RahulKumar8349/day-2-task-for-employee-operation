import java.util.*;
import java.util.stream.*;
class Q5
{
	 public List<Employee> nameOfEmployeesJoinAfter2015(List<Employee> employeeList)
	 {
		 List<Employee> employeesJoinedAfter2015 = employeeList.stream()
                .filter(employee -> employee.getyearOfJoining() > 2015)
                .collect(Collectors.toList());
		 return employeesJoinedAfter2015;
	 }

}