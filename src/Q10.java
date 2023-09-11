import java.util.*;
class Q10
{
	 public HashMap<String,Double> averageSalaryOfMaleAndFemale(List<Employee> employeeList)
	 {
		double averageMaleSalary = employeeList.stream()
                .filter(employee -> "Male".equals(employee.getGender()))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); 
		double averageFemaleSalary = employeeList.stream()
                .filter(employee -> "Female".equals(employee.getGender()))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

		HashMap<String,Double> hm=new HashMap<>();
		hm.put("Male",averageMaleSalary);
		hm.put("Female",averageFemaleSalary);
		
		return hm;
	 }

}