package task3;

class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor for 'Employee' class
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementation of the abstract method from 'Taxable' interface
    @Override
    public double calculateTax() {
        return salary * INCOME_TAX_RATE;
    }
}