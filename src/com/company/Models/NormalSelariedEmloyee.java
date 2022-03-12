package com.company.Models;


import ParentModel.Employee;

public class NormalSelariedEmloyee  extends Employee {
    double salary;



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public NormalSelariedEmloyee(String name, double id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double getAllsalary() {

        return salary;

    }
}
