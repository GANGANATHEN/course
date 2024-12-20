package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExp4 {
    
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/jd_bc";
        String user = "root";
        String password = "Ak420@#143";

        String sql = "SELECT * FROM employee"; 

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root",
				"Ak420@#143");
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

        	   System.out.printf("%-5s %-20s %-5s%n", "ID", "Name", "Age");
               System.out.println("---------------------------------");
        	
            while (resultSet.next()) {
               
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

            System.out.printf("%-5d %-20s %-5d%n", id, name, age);
                
               // System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}
