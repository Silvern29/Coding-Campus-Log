import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private String hostName;
    private String dbName;
    private String userName;
    private String passWord;

    public DBConnector (String hostName, String dbName, String userName, String passWord) {
        this.hostName = hostName;
        this.dbName = dbName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Connection connectDB(){
        Connection connection = null;
        try {
            System.out.println("Connecting!");
            String dbURL = "jdbc:mysql://" + hostName + "/" + dbName;
            connection = DriverManager.getConnection(dbURL, userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void breakDBCon(Connection con){
        try {
            System.out.println("Breaking connection!");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
