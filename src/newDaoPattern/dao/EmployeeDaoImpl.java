package newDaoPattern.dao;

import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Employee;
import newDaoPattern.utility.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public String saveEmployee(Employee employee) {
        String a = null;

        String query = "insert into employees ( emp_id , emp_name , emp_email,emp_phone,dept_id ) Values ( ? ,? , ?, ?, ?)";

        try (Connection connection = Dao.getDao().getConnection();

             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, employee.getEmp_id());
            statement.setString(2, employee.getEmp_name());
            statement.setString(3, employee.getEmp_email());
            statement.setString(4, employee.getEmp_phone());
            statement.setInt(2, employee.getDept_id());


            int ans = statement.executeUpdate();
            if (ans > 0) {
                a = "Employee saved successfully!";
            } else {
                a = "Error saving employee!";
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return a;
    }

    public Employee getEmployeeById(int empId) throws EmployeeException {
        String query = "SELECT * FROM employees WHERE emp_id = ?";
        Employee employee = null;

        try (Connection connection = Dao.getDao().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, empId);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    employee = new Employee(
                            rs.getInt("emp_id"),
                            rs.getString("emp_name"),
                            rs.getString("emp_email"),
                            rs.getString("emp_phone"),
                            rs.getInt("dept_id")

                    );
                } else {
                    throw new EmployeeException("Employee not found with ID: " + empId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new EmployeeException("Error retrieving employee with ID: " + empId, e);
        }

        return employee;
    }

    @Override
    public Employee getEmpByName(String empName) {
        return null;
    }

    public List<Employee> getAllEmployees() throws EmployeeException {
        String query = "SELECT * FROM employees";
        List<Employee> employees = new ArrayList<>();

        try (Connection connection = Dao.getDao().getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                employees.add(new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("emp_name"),
                        rs.getString("emp_email"),
                        rs.getString("emp_phone"),
                        rs.getInt("dept_id")

                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new EmployeeException("Error retrieving employees", e);
        }

        return employees;
    }

    @Override
    public Employee getEmployeeByEmail(String empEmail) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String query = "Update employees set emp_name=?,emp_email=?,emp_phone=?,dept_id=? where emp_id=?";
        try (Connection c = Dao.getDao().getConnection();
             PreparedStatement ppsmt = c.prepareStatement(query)) {
            ppsmt.setString(1, employee.getEmp_name());
            ppsmt.setString(2, employee.getEmp_email());
            ppsmt.setString(3, employee.getEmp_phone());
            ppsmt.setInt(4, employee.getDept_id());
            ppsmt.setInt(5, employee.getEmp_id());
            int ans = ppsmt.executeUpdate();

            if (ans > 0) {
                return employee;
            } else {
                throw new EmployeeException("No  emp_id found with ID: " + employee.getEmp_id());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
