package week2.EmployeeSalary;

public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee() {

    }

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    double bonus(){
        if (this.workHours <= 40){

            System.out.println("Maaş bonusunuz bulunmamaktadır.");

            double bonusAmount = 0;

            return bonusAmount;
        }
        if (this.workHours > 40){

            double bonusAmount = ((this.workHours - 40) * 30);

            return bonusAmount;

        }
        return 0;
    }

    double tax(){
        if(this.salary < 100){

            System.out.println("1000Tl nin altındaki maaşlara vergi uygulanmamaktadır.");

            return 0;
        }
        if (this.salary >= 1000){

            double taxAmount = this.salary * 0.03;

            return  taxAmount;

        }
        return 0;
    }


    double raiseSalary(){
        if (2021 - this.hireYear < 10){

            double salaryRaise = this.salary*0.05;

            return salaryRaise;
        } else if (2021 -this.hireYear < 20 && 2021 - this.hireYear >= 10) {

            double salaryRaise = this.salary * 0.10;

            return salaryRaise;

        }else {

            double salaryRaise = this.salary * 0.15;

            return salaryRaise;

        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    double taxAndBonus(){

        double taxAndSalary = bonus() - tax();

        double netSalary = this.salary + taxAndSalary;

        return netSalary;
    }

    double totalSalary(){

        double totalSalary = taxAndBonus() + raiseSalary();

        return totalSalary;
    }

}
























