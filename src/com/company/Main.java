package com.company;

import com.company.Models.HourSalariedEmployee;
import com.company.Models.NormalSelariedEmloyee;
import com.company.Models.SellSalariedEmployee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NormalSelariedEmloyee normalSelariedEmloyee = new NormalSelariedEmloyee("Mukto", 5785485, 50000);
        HourSalariedEmployee hourSalariedEmployee = new HourSalariedEmployee("Mamunur", 90859086, 3, 800);
        SellSalariedEmployee sellSalariedEmployee = new SellSalariedEmployee( "Masum Rana", 458598954, 17000, 200000, 2.5);
        System.out.println("\n");
        System.out.println("Salary Information");
        System.out.println("==================================");
        System.out.println(normalSelariedEmloyee.getName()+ " "+ normalSelariedEmloyee.getAllsalary());
        System.out.println(hourSalariedEmployee.getName()+ " "+ hourSalariedEmployee.getAllsalary());
        System.out.println(sellSalariedEmployee.getName()+ " "+ sellSalariedEmployee.getAllsalary());

    }
}
