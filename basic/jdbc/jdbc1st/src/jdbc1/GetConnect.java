package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;;

public class GetConnect {
    private static Connection con = null;
    static String url = "jdbc:mysql://localhost:3306/empdb";
    static String user = "root";
    static String password = "root";

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
            
        }
        catch(Exception e ){
            e.printStackTrace();
        }
        return con;
    }
}
