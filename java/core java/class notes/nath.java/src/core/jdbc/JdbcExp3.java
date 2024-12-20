package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcExp3 {

	public String URL = "jdbc:mysql://localhost:3306/jd_bc";
	public String USER = "root";
	public String PASSWORD = "Ak420@#143";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();

		System.out.print("Enter employee age: ");
		int age = scanner.nextInt();
		scanner.close();

		insertEmployee(name, age);
		retrieveEmployees();
		
		
	}

	private static void retrieveEmployees() {
		String sql = "SELECT id,name,age FROM employee";

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root",
				"Ak420@#143");
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {
				// Retrieving id, name, and age from the result set
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");

				System.out.println("Id : " + id + " : name : " + name + " : age : " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertEmployee(String name, int age) {
		String sql = "INSERT INTO employee (name, age) VALUES (?, ?)";

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root",
				"Ak420@#143"); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);

			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new employee was inserted successfully!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
