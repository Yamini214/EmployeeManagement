package BasicConnection;

import java.sql.*;

public class demo {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("in driver try==========");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "12345");
            System.out.println("inn connetion try==============");


            Statement st = con.createStatement();


            ResultSet rs = st.executeQuery("select * from standard");


            while (rs.next()) {


                System.out.println(rs.getInt(1) + " class name " + rs.getString(2) + " section " + rs.getString(3));


            }

            System.out.println();

            // 5
            con.close();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
