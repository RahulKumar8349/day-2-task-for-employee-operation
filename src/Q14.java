import java.util.*;
import java.util.stream.*;
class Q14
{
	 public Employee oldestEmployeeWithAgeAndDepartment(List<Employee> employeeList)
	 {
		Employee oldestEmployee = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
				return oldestEmployee;
	 }

}