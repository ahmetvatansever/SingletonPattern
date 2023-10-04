import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        System.out.println("");
        System.out.println("-------------------- StaticSingleton --------------------");
        Connection connectionStatic = StaticSingleton.getConnection();


        System.out.println("");
        System.out.println("-------------------- SingletonDatabaseConnection --------------------");
        SingletonDatabaseConnection singletonDatabaseConnection = new SingletonDatabaseConnection();
        Connection connection = null;

        try {
            connection = singletonDatabaseConnection.getConnection();
        }catch (SQLException exception){
            singletonDatabaseConnection.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }


        System.out.println("");
        System.out.println("-------------------- EnumSingleton --------------------");
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton1.getInfo());
    }
}
