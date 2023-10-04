import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDatabaseConnection {

    private Connection conn;

    private String userName = "root";
    private String password = "123456";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
       System.out.println("SingletonDatabaseConnection ile baglandi.");
       return DriverManager.getConnection(dbUrl, userName, password);

    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error      : " + exception.getMessage());
        System.out.println("Error Code : " + exception.getErrorCode());
    }

}
