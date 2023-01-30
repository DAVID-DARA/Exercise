package com.One;


public class Employee {
    private double salary;
    private int workingHoursPerDay;

    void getInfo(double salary, int workingHoursPerDay)
    {
        this.salary = salary;
        System.out.println("Salary: "+salary);
        this.workingHoursPerDay = workingHoursPerDay;
        System.out.println("Working Hours: "+ workingHoursPerDay);
    }

    void addSal()
    {
        if (this.salary < 500)
        {
            this.salary = salary + 10;
            System.out.println("Salary_Base_Type: "+ this.salary);
        }
    }

    void addWOrk()
    {
        if (this.workingHoursPerDay > 6)
        {
            this.salary = salary + 6;
            System.out.println("Salary: "+ this.salary);
            System.out.println("Working Hours: "+ this.workingHoursPerDay);
        }


    }

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.getInfo(500, 7);
        employee.addSal();
        employee.addWOrk();

    }

}