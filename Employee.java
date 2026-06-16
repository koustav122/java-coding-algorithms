// public class Employee {
    
import java.util.Scanner;

// Custom Exception
class InvalidSalaryException extends Exception {
    InvalidSalaryException(String msg) {
        super(msg);
        //string ji i love to play football also like java and cofeee ☕
        
    }
}

// Parent Class
class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

// Child Class
class Manager extends Employee {
    double bonus;

    Manager(int empId, String empName, double salary, double bonus) {
        super(empId, empName, salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return salary + bonus;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            String name = sc.nextLine();
            double salary = sc.nextDouble();
            double bonus = sc.nextDouble();

            if (salary < 10000) {
                throw new InvalidSalaryException("Salary must be at least 10000");
            }

            Manager m = new Manager(id, name, salary, bonus);
            m.display();

        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}