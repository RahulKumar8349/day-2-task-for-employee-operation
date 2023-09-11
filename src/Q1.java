import java.util.*;
class Q1
{
	public HashMap<String,Integer> getMaleAndFemaleCount(List<Employee> employeeList)
	{

		

		int malecount =(int) employeeList.stream()
               .filter( a-> a.gender.equals("Male"))
               //.mapToInt(Integer::intValue)
               .count();
		
		int femalecount =(int) employeeList.stream()
               .filter( a-> a.gender.equals("Female"))
               //.mapToInt(Integer::intValue)
               .count();
			   
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Male",malecount);
		hm.put("Female",femalecount);
		
		return hm;
			
	}
}