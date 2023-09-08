import java.util.*;
import java.util.stream.*;
class Q11
{
	 public Map<String, List<String>>  nameOfEachEmployeeInEachDepartment(List<Employee> employeeList)
	 {
		 Map<String, List<String>> departmentToNames = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
		 return departmentToNames;
	 }

}