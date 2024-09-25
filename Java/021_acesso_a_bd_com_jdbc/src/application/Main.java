package application;

import db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement st = null;

        try {
            connection = DB.getConnection();
            st = connection.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)", Statement.RETURN_GENERATED_KEYS);

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int affectedRows = st.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Done! Rows affected: " + affectedRows);
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    System.out.println(rs.getInt(1));
                }
            } else {
                System.out.println("No rows affected.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeConnection();
        }
    }
}
