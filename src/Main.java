import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("Q1 - How many male and female employees are there in the organization?\n");
        System.out.println(new Q1().getMaleAndFemaleCount(employeeList)+"\n\n");

        System.out.println("Q2 - Print the name of all departments in the organization?\n\n");
        System.out.println(new Q2().printNameOfAllDepartment(employeeList)+"\n\n");

        System.out.println("Q3 - What is the average age of male and female employees?\n\n");
        System.out.println(new Q3().averageAgeOfMaleAndFemale(employeeList)+"\n\n");

        System.out.println("Q4 - Get the details of highest paid employee in the organization?\n\n");
        System.out.println(new Q4().highestPaidEmployee(employeeList)+"\n\n");

        System.out.println("Q5 - Get the names of all employees who have joined after 2015?\n");
        System.out.println(new Q5().nameOfEmployeesJoinAfter2015(employeeList)+"\n\n");

        System.out.println("Q6 - Count the number of employees in each department?\n\n");
        System.out.println(new Q6().countNumberOfEmpoyeeInEachDepartment(employeeList)+"\n\n");

        System.out.println("Q7 - What is the average salary of each department?\n\n");
        System.out.println(new Q7().averageSalaryOfEachDepartment(employeeList)+"\n\n");

        System.out.println("Q8 - Get the details of youngest male employee in the product development department?\n");
        System.out.println(new Q8().youngestMaleEmployeeInProductDevelopmentDepartment(employeeList)+"\n\n");

        System.out.println("Q9 - How many male and female employees are there in the sales and marketing team?\n");
        System.out.println(new Q9().howManyMaleAndFemaleEmployeeInSalesAndMarketingTeam(employeeList)+"\n\n");

        System.out.println("Q10 - What is the average salary of male and female employees?\n\n");
        System.out.println(new Q10().averageSalaryOfMaleAndFemale(employeeList)+"\n\n");

        System.out.println("Q11 - List down the names of all employees in each department?\n\n");
        System.out.println(new Q11().nameOfEachEmployeeInEachDepartment(employeeList)+"\n\n");

        System.out.println("Q12 - What is the average salary and total salary of the whole organization?\n");
        System.out.println(new Q12().averageSalaryAndWholeSalaryOfOrganization(employeeList)+"\n\n");

        System.out.println("Q13 -  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?\n");
        System.out.println(new Q13().employeeAgeLessThan26Year(employeeList)+"\n\n");

        System.out.println("Q14 - Who is the oldest employee in the organization? What is his age and which department he belongs to?\n");
        Employee last=new Q14().oldestEmployeeWithAgeAndDepartment(employeeList);
        System.out.println(last.name + " "+ last.age + " "+last.department+"\n\n");



    }
}