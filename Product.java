package task3;

import java.util.Scanner;

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor for 'Product' class
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementation of the abstract method from 'Taxable' interface
    @Override
    public double calculateTax() {
        return price * quantity * SALES_TAX_RATE;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting employee information from the user
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Creating an 'Employee' object
        Employee employee = new Employee(empId, empName, empSalary);

        // Printing income tax for the employee
        System.out.println("Income Tax for Employee: " + employee.calculateTax());

        // Accepting product information from the user
        System.out.print("\nEnter Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int productQuantity = scanner.nextInt();

        // Creating a 'Product' object
        Product product = new Product(productId, productPrice, productQuantity);

        // Printing sales tax for the product
        System.out.println("Sales Tax for Product: " + product.calculateTax());

        scanner.close();
    }
}
