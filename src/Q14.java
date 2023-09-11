import java.util.*;
class Q14
{
	 public Employee oldestEmployeeWithAgeAndDepartment(List<Employee> employeeList)
	 {
		return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);
	 }

}