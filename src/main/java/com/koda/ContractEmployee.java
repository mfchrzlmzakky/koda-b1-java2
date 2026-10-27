package com.koda;

public class ContractEmployee extends Employee {
  public ContractEmployee(String employeeId, String name, String position, String department, int salary){
    super(employeeId, name, position, department, salary);
  }

  @Override 
  public void increaseSalary(int amount){
    if (amount >= 0) {
      increaseSalaryRule2(amount);
    } else {
      System.out.println("Error: Kenaikan gaji harus lebih dari 0");
      // throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
    }
  }
}
