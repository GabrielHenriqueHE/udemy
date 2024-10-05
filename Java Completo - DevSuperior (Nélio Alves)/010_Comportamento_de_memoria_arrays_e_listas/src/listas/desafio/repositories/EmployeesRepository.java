package listas.desafio.repositories;

import listas.desafio.dto.EmployeeDTO;
import listas.desafio.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeesRepository {
    private final List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAll() {
        return this.employeeList;
    }

    public Employee getById(Integer id) {
        return this.employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public void save(Employee employee) {
        this.employeeList.add(employee);
    }

    public void update(int id, EmployeeDTO data) {
        Employee employee = this.employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (data != null && employee != null) {
            if (data.getName() != null && !data.getName().isEmpty()) {
                employee.setName(data.getName());
            }

            if (data.getSalary() > 0) {
                employee.setSalary(data.getSalary());
            }
        }
    }
}
