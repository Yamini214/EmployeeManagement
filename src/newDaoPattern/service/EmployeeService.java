package newDaoPattern.service;

import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Employee;

import java.util.List;

public interface EmployeeService {
    String employInfo(Employee employee);

    public String saveEmployee(Employee employee);
    public Employee getEmployeeById(int emp_id)throws EmployeeException;

    Employee getEmployeeByName(String emp_name) throws EmployeeException;

    Employee getEmployeeByEmail(String emp_email) throws EmployeeException;

    public List<Employee>getAllEmployees()throws EmployeeException;

    public Employee updateEmployee(Employee employee) throws EmployeeException ;


}
