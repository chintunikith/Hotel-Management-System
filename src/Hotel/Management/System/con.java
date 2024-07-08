package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {
    Connection connection;
    Statement statement;

    public con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "1a0qaeta");
            statement = connection.createStatement();
            //Connection with database has been ready now
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
