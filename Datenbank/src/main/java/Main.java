import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector("localhost", "ccp19", "root", "pass");

        Connection con = dbc.connectDB();
//        dbc.breakDBCon(con);

        String dbQuery = "SELECT * FROM employees";

        try {
            Statement state = con.createStatement();
            ResultSet result = state.executeQuery(dbQuery);

            while(result.next()) {
                int personnelNumber = result.getInt("personnel_number");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String street = result.getString("street");
                String appartmentNumber = result.getString("appartment_number");
                String zip = result.getString("zip");
                String phonenumber = result.getString("phonenumber");
                String email = result.getString("email");
                Date updatedAt = result.getDate("updated_at");
                Date createdAt = result.getDate("created_at");

                System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s, %s, %s", firstName, lastName, street, appartmentNumber, zip, phonenumber,email, updatedAt, createdAt);
            }
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
