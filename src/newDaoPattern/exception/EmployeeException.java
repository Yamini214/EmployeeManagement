package newDaoPattern.exception;

import java.sql.SQLException;

public class EmployeeException extends  Exception {
    public EmployeeException(){
        super();
    }
    public EmployeeException(String message) {

        super(message);
    }


    public EmployeeException(String s, SQLException e) {
    }
}
