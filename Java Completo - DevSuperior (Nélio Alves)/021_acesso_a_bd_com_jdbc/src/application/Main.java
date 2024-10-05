package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        Statement st = null;

        try {

            connection = DB.getConnection();
            connection.setAutoCommit(false);
            st = connection.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
            System.out.println("Rows 1 = " + rows1);

            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error");
//            }

            System.out.println("Rows 2 = " + rows2);

            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by " + e1.getMessage());
            }
            // Exception in thread "main" db.DbIntegrityException:
            // Cannot delete or update a parent row: a foreign key constraint fails
            // (`coursejdbc`.`seller`, CONSTRAINT `seller_ibfk_1`
            // FOREIGN KEY (`DepartmentId`) REFERENCES `department` (`Id`))
            //	at application.Main.main(Main.java:29)
        } finally {
            DB.closeConnection();
        }
    }
}
