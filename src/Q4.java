import java.util.*;
class Q4
{
	 public Optional<Employee> highestPaidEmployee(List<Employee> employeeList)
	 {
		 return employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
	 }

}