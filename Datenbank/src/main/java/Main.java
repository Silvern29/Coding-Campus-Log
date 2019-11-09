import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector("localhost", "ccp19", "root", "pass");

        String dbQuery = "SELECT * FROM employees";

        insertInto(dbc, "'Karl'", "'Mustermann'", "'Musterstr.'", "'5'", "'87568'", "'06642003039'", "'florian@redlinghaus.at'");
        printTable(dbc, dbQuery);
    }

    public static void insertInto(DBConnector dbc, String firstName, String lastName, String street, String appartmentNumber, String zip, String phonenumber, String email) {
        Connection con = dbc.connectDB();
        String dbUpdate = "INSERT INTO employees (first_name, last_name, street, appartment_number, zip, phonenumber, email) "
                        + "VALUES (" + firstName + ", " + lastName + ", " + street + ", " + appartmentNumber + ", " + zip + ", " + phonenumber + ", " + email + ")";

        try {
            Statement state = con.createStatement();
            state.executeUpdate(dbUpdate);
            dbc.breakDBCon(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printTable(DBConnector dbc, String dbQuery){
        Connection con = dbc.connectDB();

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

                System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", personnelNumber, firstName, lastName, street, appartmentNumber, zip, phonenumber,email, updatedAt, createdAt);
            }
            dbc.breakDBCon(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
