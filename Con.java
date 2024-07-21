package bank.management.system;

import java.sql.*;
//import java.sql.DriverManager;

public class Con {
    Connection connection;
    Statement statement;
    public Con()
    {
        try
        {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Rsunny@2526");
            statement=connection.createStatement();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
