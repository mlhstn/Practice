package week2.EmployeeSalary;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("melih",2000,45,1985);

        System.out.println(e1.toString());
        System.out.println(e1.tax());
        System.out.println(e1.bonus());
        System.out.println(e1.raiseSalary());
        System.out.println(e1.taxAndBonus());
        System.out.println(e1.totalSalary());
        
    }
}
