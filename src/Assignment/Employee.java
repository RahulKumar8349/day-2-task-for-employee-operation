package Assignment;

public class Employee
{
    int id;
    String name;
    int age;
    public String gender;
    String department;
    int yearOfJoining;
    double salary;
	
	Employee(int id,String name,int age,String gender,String department,int yearOfJoining,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "\nid="+id+" name="+name+" age="+age+" gender="+gender+" department="+department
		+" yearOfJoining="+yearOfJoining+" salary="+salary;
	}
	
	public String getName() {
        return name;
    }

    
	
	 public int getAge() {
        return age;
    }
	
	public String getGender() {
        return gender;
    }
	
	 public String getDepartment() {
        return department;
    }
	
	 public int getyearOfJoining() {
        return yearOfJoining;
    }
	
	public double getSalary() {
        return salary;
    }

}