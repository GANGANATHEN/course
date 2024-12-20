package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExp2 {
	
    public static void main(String[] args) {
    	
        String url = "jdbc:mysql://localhost:3306/jd_bc"; 
        String user = "root"; 
        String password = "Ak420@#143"; 

        // Load MySQL JDBC Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL driver class name

            // Establish the connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root", "Ak420@#143");
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM employee"))
            { 

                // Process the result set
                while (resultSet.next()) {
                    
                	int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    
                    
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    				
      
//                    String data = resultSet.getString("name");
//                    System.out.println(data);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}
