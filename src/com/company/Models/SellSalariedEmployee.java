package com.company.Models;

import ParentModel.Employee;

public class SellSalariedEmployee extends Employee {
    double mainsalary;
    double grosssell;
    double totalpercentange;

    public SellSalariedEmployee(String name, double id,double mainsalary, double grosssell, double totalpercentange) {
        super(name, id);
        this.mainsalary = mainsalary;
        this.grosssell = grosssell;
        this.totalpercentange = totalpercentange;
    }

    public double getMainsalary() {
        return mainsalary;
    }

    public void setSalary(double salary) {
        this.mainsalary = mainsalary;
    }

    public double getGrosssell() {
        return grosssell;
    }

    public void setGrosssell(double grosssell) {
        this.grosssell = grosssell;
    }

    public double getTotalpercentange() {
        return totalpercentange;
    }

    public void setTotalpercentange(double totalpercentange) {
        this.totalpercentange = totalpercentange;
    }

    @Override
    public double getAllsalary() {
        return (mainsalary+((grosssell*totalpercentange)/100));
    }
}
