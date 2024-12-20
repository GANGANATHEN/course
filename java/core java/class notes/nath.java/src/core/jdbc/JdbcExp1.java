package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExp1 {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jd_bc";
		String user = "root";
		String password = "Ak420@#143";

		String sql = "SELECT * FROM employee"; 

	
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root",
				"Ak420@#143");
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {

		
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                
                
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
				
//				String data = resultSet.getString("name");
//				System.out.println(data);
                
			}

		} catch (SQLException e) {
			e.printStackTrace(); 
		}
	}
}
