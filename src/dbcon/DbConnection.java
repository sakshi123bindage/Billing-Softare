/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author saksh
 */
public class DbConnection {
    static Connection con;
    static public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/billing_software", "root", "root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
