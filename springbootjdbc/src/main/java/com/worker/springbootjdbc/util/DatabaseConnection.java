package com.worker.springbootjdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/org";
    private static final String username = "root";
    private static final String password = "Amritraj@1998";
    private static Connection connection=null;

    private DatabaseConnection() {
    }

    public static Connection getConnection() throws ClassNotFoundException{
    	if(connection == null){
    		try  {
    			Connection connection = DriverManager.getConnection(url, username, password);
    			System.out.println("Connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion());
                    return connection;
    		}catch(Exception e){
    			System.out.println(e);
    		}
    	}
    	return connection;   
    }
    public static void closeConnection() throws SQLException {
    	connection.close();
    }
}

