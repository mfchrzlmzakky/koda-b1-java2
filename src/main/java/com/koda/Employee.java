// package com.koda;

// public class Employee {

//   private EmployeeService employeeId;
//   private EmployeeService name;
//   private EmployeeService position; 
//   private EmployeeService department;
//   private EmployeeService salary;

//   public Employee(EmployeeService employeeId, EmployeeService name, EmployeeService position, EmployeeService department, EmployeeService salary) {
//     this.employeeId = employeeId;
//     this.name = name;
//     this.position = position;
//     this.department = department;
//     this.salary = salary;
//   }

//   public void showEmployee(){
//     System.out.println("================================");
//     System.out.println("KODA ENTERPRISE");
//     System.out.println("================================");
//     System.out.println("Employee ID: " + employeeId.getEmployeeID());
//     System.out.println("Name: " + name.getName());
//     System.out.println("Position: " + position.getPosition());
//     System.out.println("Department: " + department.getDepartment());
//     System.out.println("Salary: Rp" + salary.getSalary() + "\n");
//   }

//   public void giveRaise(int amount){
//     System.out.println("Salary Increase: Rp" + amount);
//     salary.increaseSalary(amount);
//     System.out.println("Current Salary: Rp" + salary.getSalary() + "\n");
//   }
// }

package com.koda;

public abstract class Employee {
  private String employeeId;
  private String name;
  private String position; 
  private String department;
  private int salary;

  public Employee(String employeeId, String name, String position, String department, int salary){
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public String getEmployeeID(){
    return employeeId;
  }

  public String getName(){
    return name;
  }

  public String getPosition(){
    return position;
  }

  public String getDepartment(){
    return department;
  }

  public int getSalary(){
    return salary;
  }

  // public void increaseSalary(int amount){
  //   if (amount >= 0) {
  //     salary += amount;
  //   } else {

  //     System.out.println("Error: Kenaikan gaji harus lebih dari 0");
  //   }
  // }

  public abstract void increaseSalary(int amount);

  public void increaseSalaryRule(int amount){
    salary += amount;
  }

  public void increaseSalaryRule2(int amount){
    if (amount <= 500000) {
      salary += amount;
    } else {
      System.out.println("Error: Kenaikan gaji tidak boleh lebih dari 500000");
      // throw new IllegalArgumentException("Error: Kenaikan gaji tidak boleh lebih dari 500000");
    }
  }


}