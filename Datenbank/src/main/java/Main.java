import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector("localhost", "ccp19", "root", "pass");

        String dbQuery = "SELECT * FROM employees";

        insertInto(dbc, "'Pilot'", "'Karl'", "'Mustermann'", "'Musterstr.'", "'5'", "'87568'", "'06642003039'", "'florian@redlinghaus.at'");
        printTable(dbc, dbQuery);
        updateDB(dbc, "last_name", "'Maier'", "comp_id = 1");
        printTable(dbc, dbQuery);
    }

    public static void updateDB(DBConnector dbc, String column, String value, String cond) {
        Connection con = dbc.connectDB();
        String dbUpdate = "UPDATE employees "
                        + "SET " + column + " = " + value
                        + "WHERE " + cond;

        try {
            Statement state = con.createStatement();
            state.executeUpdate(dbUpdate);
            dbc.breakDBCon(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertInto(DBConnector dbc, String crewStatus, String firstName, String lastName, String street, String apartment, String zip, String phone, String email) {
        Connection con = dbc.connectDB();
        String dbUpdate = "INSERT INTO employees (crew_status, first_name, last_name, street, apartment, zip, phone, email) "
                        + "VALUES (" + crewStatus + ", " + firstName + ", " + lastName + ", " + street + ", " + apartment + ", " + zip + ", " + phone + ", " + email + ")";

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
                int compId = result.getInt("comp_id");
                String crewStatus = result.getString("crew_status");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String street = result.getString("street");
                String apartment = result.getString("apartment");
                String zip = result.getString("zip");
                String phone = result.getString("phone");
                String email = result.getString("email");
                Date updatedAt = result.getDate("updated_at");
                Date createdAt = result.getDate("created_at");

                System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", compId, crewStatus, firstName, lastName, street, apartment, zip, phone,email, updatedAt, createdAt);
            }
            dbc.breakDBCon(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
