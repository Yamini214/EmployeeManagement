package newDaoPattern.usecase;

import newDaoPattern.exception.EmployeeException;
import newDaoPattern.model.Employee;
import newDaoPattern.service.EmployeeService;
import newDaoPattern.service.EmployeeServiceImpl;

import java.util.List;

public  class Demo2 {

    public static void main(String[] args) {

        EmployeeService serivce=new EmployeeServiceImpl();
//        //insert into table employee
//
//        Employee emp=new Employee(102,"Umesh  Pandey","rudrapandey@gmail.com","7322678",22);
//        String s =serivce.saveEmployee(emp);
//

//
//        System.out.println(s);
//select table data

//        try {
//            List<Employee> laptops =  serivce.getAllEmployees();
//            System.out.println("All Employee:");
//            for (Employee l : laptops) {
//                System.out.println(l.getEmp_id() + " " + l.getEmp_name()
//                        + " " + l.getEmp_email()+" "+l.getEmp_phone()+" "+l.getDept_id()+" ");
//            }
//        } catch (EmployeeException e) {
//            System.out.println(e.getMessage());
//        }


//        UPDATE - Updating laptop details
         Employee updatedEmployee=new Employee(101,"Rahul Patidar","patidarrahul@gmail.com"," .....2007",11);
  try {
            Employee updated = serivce.updateEmployee(updatedEmployee);
            System.out.println("Updated Laptop: " +updated.getEmp_id()+" "+ updated.getEmp_name() + " " + updated.getEmp_email() + " " + updated.getEmp_phone() + " " + updated.getDept_id() + " " + " ");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }

    }}
