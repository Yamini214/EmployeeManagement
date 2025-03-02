package newDaoPattern.model;

import java.sql.Date;

public class Employee {
    private int emp_id;
    private String emp_name;

    private String emp_phone;
    private String emp_email;
    private int dept_id;
    private String hire_date;

    public Employee(int empId, String empName, String empEmail, String empPhone, int deptId) {
        this.emp_id = empId;
        this.emp_name = empName;
        this.emp_email = empEmail;
        this.emp_phone = empPhone;
        this.dept_id = deptId;
    }




    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

}
