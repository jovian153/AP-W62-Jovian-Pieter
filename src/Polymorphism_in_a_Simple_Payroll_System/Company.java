package Polymorphism_in_a_Simple_Payroll_System;
public class Company {
    public static void main(String[] args){
        double TotalPayroll = 0;
        Employee[] Karyawan = new Employee[4];

        Karyawan[0] = new Manager("Alya", 5000000);
        Karyawan[1] = new Programmer("Budi",4000000 );
        Karyawan[2] = new Programmer("Citra", 4500000);
        Karyawan[3] = new Intern("Dina",2000000);

        for(int i = 0;i <=3; i++){
            Karyawan[i].printInfo();
            System.out.println("-------------------------");
            TotalPayroll += Karyawan[i].calculateSalary();
        }

        System.out.println("Total Payroll : " + (long)TotalPayroll);
    }
}

class Employee{
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }

    public String getRole(){
        return "Employee";
    }

    public void printInfo(){
        System.out.println("Your name : " + this.name);
        System.out.println("Type : " + this.getRole());
        System.out.println("Final Salary : " + this.calculateSalary());
    }
}

class Manager extends Employee{
    public Manager(String name, double baseSalary){
        super(name,baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary + 2000000;
    }

    @Override
    public String getRole(){
        return "Manager";
    }
}

class Programmer extends Employee{
    public Programmer(String name, double baseSalary){
        super(name, baseSalary);
    }
    
    @Override
    public double calculateSalary(){
        return baseSalary + 1000000;
    }

    @Override
    public String getRole(){
        return "Programmer";
    }
}

class Intern extends Employee{
    public Intern(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary + 300000;
    }

    @Override
    public String getRole(){
        return "Intern";
    }
}