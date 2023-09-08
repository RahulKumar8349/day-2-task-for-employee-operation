import java.util.*;
import java.util.stream.*;
class Q1
{
	public HashMap<String,Integer> getMaleAndFemaleCount(List<Employee> employeeList)
	{
		int malecount=0;
		int femalecount=0;
		

		malecount =(int) employeeList.stream()
               .filter( a-> a.gender.equals("Male"))
               //.mapToInt(Integer::intValue)
               .count();
		
		femalecount =(int) employeeList.stream()
               .filter( a-> a.gender.equals("Female"))
               //.mapToInt(Integer::intValue)
               .count();
			   
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Male",malecount);
		hm.put("Female",femalecount);
		
		return hm;
			
	}
}