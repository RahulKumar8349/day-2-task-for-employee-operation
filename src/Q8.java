import java.util.*;
import java.util.stream.*;
class Q8
{
	 public Optional<Employee> youngestMaleEmployeeInProductDevelopmentDepartment(List<Employee> employeeList)
	 {
		Optional<Employee> youngestMaleInProductDev = employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("Product Development"))
                .filter(employee -> employee.getGender().equals("Male"))
                .min(Comparator.comparingInt(Employee::getAge));
		return youngestMaleInProductDev;
	 }

}