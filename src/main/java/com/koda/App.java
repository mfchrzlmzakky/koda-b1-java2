package com.koda;

public class App 
{
    public static void main( String[] args )
    {
        // Employee employee1 = new ContractEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);

        // EmployeeService employeesatu = new EmployeeService(employee1, employee1, employee1, employee1, employee1);

        // employeesatu.showEmployee();

        // employeesatu.giveRaise(1000000);
        // employeesatu.giveRaise(-500000);

        Employee employee1 = new PermanentEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);

        EmployeeService employeesatu = new EmployeeService(employee1, employee1, employee1, employee1, employee1);

        employeesatu.showEmployee();

        employeesatu.giveRaise(1000000);

        Employee employee2 = new ContractEmployee("EMP002", "Budi Santoso", "Frontend Developer", "IT", 5000000);

        EmployeeService employeedua = new EmployeeService(employee2, employee2, employee2, employee2, employee2);

        employeedua.showEmployee();

        employeedua.giveRaise(300000);
        employeedua.giveRaise(1000000);
        employeedua.giveRaise(-500000);
    }
}
