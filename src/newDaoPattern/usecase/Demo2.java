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
//
//
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



        //by name


        // Get employee by name
//        String employeeName = "Kirti Sharma"; // Change this name as needed
//        try {
//            Employee emp = service.getEmployeeByName(employeeName);
//            System.out.println("Employee Found: " + emp.getEmp_id() + "  " + emp.getEmp_name()
//                    + "  " + emp.getEmp_email() + " " + emp.getEmp_phone() + " " + emp.getDept_id());
//        } catch (EmployeeException e) {
//            System.out.println(e.getMessage());
//        }
//        UPDATE - Updating employee details
//        Employee updatedEmployee=new Employee( 102," Trisha Patel","trishapatel@gmail.com","9873217890",13);
//  try {
//            Employee updated = serivce.updateEmployee(updatedEmployee);
//            System.out.println("Updated Employee: " +updated.getEmp_id()+" "+ updated.getEmp_name() + " " + updated.getEmp_email() + " " + updated.getEmp_phone() + " " + updated.getDept_id() + " " + " ");
//        } catch (EmployeeException e) {
//            System.out.println(e.getMessage());
//        }



//
//        Departments updatedepartments = new Departments(76, "IT");
//  try {
//
//      Departments Update =  services.updatedepartments(updatedepartments);
//            System.out.println("Updated Department: " +Update.getDepartmentId()+" "+ Update.getDepartmentName()  );
//        } catch (EmployeeException e) {
//            System.out.println(e.getMessage());
//        }
        // DELETE EMPLOYEE
//
//        try{
//            String deleteMessage = service.deleteEmployeeById(102);
//            System.out.println(deleteMessage);
//        }catch (EmployeeException e){
//            System.out.println(e.getMessage());
//        }

    }
}




