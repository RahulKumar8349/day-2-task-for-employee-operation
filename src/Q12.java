import java.util.*;
class Q12
{
	 public HashMap<String,Double> averageSalaryAndWholeSalaryOfOrganization(List<Employee> employeeList)
	 {
        // Calculate average salary using Stream API
        double averageSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); 
				
		double totalSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
				
		HashMap<String,Double> hm=new HashMap<>();
		hm.put("Average Salary",averageSalary);
		hm.put("Whole Salary",totalSalary);
		
		return hm;
		
	 }

}