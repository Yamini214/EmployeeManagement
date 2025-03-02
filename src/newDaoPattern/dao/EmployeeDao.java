package newDaoPattern.dao;

import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public String saveEmployee(Employee employee);
    public Employee getEmployeeById(int emp_id)throws EmployeeException;

    Employee getEmpByName(String empName) throws EmployeeException;

    List<Employee> getAllEmployees() throws EmployeeException;

    Employee getEmployeeByEmail(String empEmail);

    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int emp_id) throws EmployeeException;

}
