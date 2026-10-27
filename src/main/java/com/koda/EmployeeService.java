// package com.koda;

// public class EmployeeService {
//   private String employeeId;
//   private String name;
//   private String position; 
//   private String department;
//   private int salary;

//   public EmployeeService(String employeeId, String name, String position, String department, int salary){
//     this.employeeId = employeeId;
//     this.name = name;
//     this.position = position;
//     this.department = department;
//     this.salary = salary;
//   }

//   public String getEmployeeID(){
//     return employeeId;
//   }

//   public String getName(){
//     return name;
//   }

//   public String getPosition(){
//     return position;
//   }

//   public String getDepartment(){
//     return department;
//   }

//   public int getSalary(){
//     return salary;
//   }

//   public void increaseSalary(int amount){
//     if (amount >= 0) {
//       salary += amount;
//     } else {

//       System.out.println("Error: Kenaikan gaji harus lebih dari 0");
//     }
//   }


// }

package com.koda;

public class EmployeeService {

  private Employee employeeId;
  private Employee name;
  private Employee position; 
  private Employee department;
  private Employee salary;

  public EmployeeService(Employee employeeId, Employee name, Employee position, Employee department, Employee salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public void showEmployee(){
    System.out.println("================================");
    System.out.println("KODA ENTERPRISE");
    System.out.println("================================");
    System.out.println("Employee ID: " + employeeId.getEmployeeID());
    System.out.println("Name: " + name.getName());
    System.out.println("Position: " + position.getPosition());
    System.out.println("Department: " + department.getDepartment());
    System.out.println("Salary: Rp" + salary.getSalary() + "\n");
  }

  public void giveRaise(int amount){
    System.out.println("Salary Increase: Rp" + amount);
    salary.increaseSalary(amount);
    System.out.println("Current Salary: Rp" + salary.getSalary() + "\n");
  }
}
