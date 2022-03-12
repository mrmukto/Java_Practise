package com.company.Models;

import ParentModel.Employee;

public class HourSalariedEmployee  extends Employee {

    public HourSalariedEmployee(String name, double id, double numofhours, double hourrate) {
        super(name, id);
        this.numofhours = numofhours;
        this.hourrate = hourrate;
    }

    double numofhours;
    double hourrate;

    public double getNumofhours() {
        return numofhours;
    }

    public void setNumofhours(double numofhours) {
        this.numofhours = numofhours;
    }

    public double getHourrate() {
        return hourrate;
    }

    public void setHourrate(double hourrate) {
        this.hourrate = hourrate;
    }

    @Override
    public double getAllsalary() {
        return (numofhours*hourrate);
    }
}
