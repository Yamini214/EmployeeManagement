package newDaoPattern.usecase;

import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Departments;
import newDaoPattern.model.Employee;
import newDaoPattern.service.DepartmentService;
import newDaoPattern.service.DepartmentServiceImpl;
import newDaoPattern.service.EmployeeService;
import newDaoPattern.service.EmployeeServiceImpl;

import java.util.List;

public  class Demo2 {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

//       insert into table employee

         Employee emp=new Employee(102,"Trisha Patel","pateltrisha@gmail.com","7890983397",12);

        String s =service.saveEmployee(emp);
        System.out.println(s);

//             select table data
        try {
            List<Employee> Employees = service.getAllEmployees();
            System.out.println("All Employee:");
            for (Employee l : Employees) {
                System.out.println(l.getEmp_id() + " " + l.getEmp_name()
                        + " " + l.getEmp_email() + " " + l.getEmp_phone() + " " + l.getDept_id() + " ");
            }
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }




        // Get employee by name
        String employeeName = "Trisha Patel";
        try {
            Employee empbyname = service.getEmployeeByName(employeeName);
            System.out.println("Employee Found: " + empbyname
                    .getEmp_id() + "  " + empbyname.getEmp_name()
                    + "  " + empbyname.getEmp_email() + " " + empbyname.getEmp_phone() + " " + empbyname.getDept_id());
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }





     //      UPDATE - Updating employee details
        Employee updatedEmployee=new Employee( 102," Trisha Patel","trishapatel@gmail.com","9873217890",13);
  try {
            Employee updated = service.updateEmployee(updatedEmployee);
            System.out.println("Updated Employee: " +updated.getEmp_id()+" "+ updated.getEmp_name() + " " + updated.getEmp_email() + " " + updated.getEmp_phone() + " " + updated.getDept_id() + " " + " ");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }




        // DELETE EMPLOYEE

        try{
            String deleteMessage = service.deleteEmployeeById(102);
            System.out.println(deleteMessage);
        }catch (EmployeeException e){
            System.out.println(e.getMessage());
        }

    }
}




