import java.util.*;
import java.util.stream.*;
class Q4
{
	 public Optional<Employee> highestPaidEmployee(List<Employee> employeeList)
	 {
		 Optional<Employee> highestSalaryEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
		 return highestSalaryEmployee;
	 }

}