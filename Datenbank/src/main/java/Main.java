public class Main {
    public static void main(String[] args) {
        DBConnector dbc = new DBConnector("localhost", "ccp19", "root", "pass");

        dbc.connectDB();
        dbc.breakDBCon();
    }
}
