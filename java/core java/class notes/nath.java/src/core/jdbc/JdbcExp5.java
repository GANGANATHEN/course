package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcExp5 {

	public static void main(String[] args) {
		try {
			insertusingps();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void insertusingps() throws Exception {
	
		
	    String url = "jdbc:mysql://localhost:3306/jd_bc"; 
        String user = "root"; 
        String password = "Ak420@#143"; 
        
        int id =66;
        String name="ashok";
        int age = 22;
        
        String query = "insert into employee values(?,?,?);";
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_bc", "root",
				"Ak420@#143");

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, age);
        
        int res = pst.executeUpdate();
        System.out.println(res);
        con.close();
		
	}
}
