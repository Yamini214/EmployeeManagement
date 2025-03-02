package newDaoPattern.service;

import newDaoPattern.dao.EmployeeDao;
import newDaoPattern.dao.EmployeeDaoImpl;
import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public String employInfo(Employee employee) {
        String s = dao.saveEmployee(employee);
        return s;
    }

    @Override
    public String saveEmployee(Employee employee) {
        String s = dao.saveEmployee(employee);

        return s;
    }

    @Override
    public Employee getEmployeeById(int emp_id) throws EmployeeException {
        Employee id = dao.getEmployeeById(emp_id);

        return id;
    }

    @Override
    public Employee getEmployeeByName(String emp_name) throws EmployeeException {
        Employee name = dao.getEmpByName(emp_name);

        return name;
    }


    public Employee getEmployeeByEmail(String emp_email) throws EmployeeException {
        Employee email = dao.getEmployeeByEmail(emp_email);

        return email;
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        List<Employee> lsEmployee = dao.getAllEmployees();
        return lsEmployee;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Employee Em=dao.updateEmployee(employee);
        return Em;
    }
    public String deleteEmployeeById(int emp_id) throws EmployeeException {

        String dlt= dao.deleteEmployeeById(emp_id);
        return dlt;


    }
}

//public