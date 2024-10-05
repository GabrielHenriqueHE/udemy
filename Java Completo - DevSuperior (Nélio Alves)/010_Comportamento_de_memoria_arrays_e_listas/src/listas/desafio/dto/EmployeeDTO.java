package listas.desafio.dto;

public class EmployeeDTO {
    private String name;
    private double salary;

    public EmployeeDTO(String name) {
        this.name = name;
    }

    public EmployeeDTO(double salary) {
        this.salary = salary;
    }

    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
