import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StaticSingleton {
    private static Connection connection;
    private static String userName = "root";
    private static String password = "123456";
    private static String dbUrl = "jdbc:mysql://localhost:3306/world";

    static{
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("StaticSingleton ile baglandi.");
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static Connection getConnection(){
        return connection;
    }
}
