package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement st = null;

        try {

            connection = DB.getConnection();
            //st = connection.prepareStatement("DELETE FROM department WHERE (Id = ?)");
            //st.setInt(1, 5);
            st = connection.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)", Statement.RETURN_GENERATED_KEYS);
            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int affectedRows = st.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Done! Rows affected: " + affectedRows);
            } else {
                System.out.println("No rows affected.");
            }

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
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
