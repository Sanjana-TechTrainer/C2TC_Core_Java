/*
 * 29th June
 * JDBC without any structure
 *
 */ 
import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/b1-6";
		String user="root";
		String pwd="01022021";
		int uid=sc.nextInt();
		String name=sc.next();
		
		String query="INSERT INTO details VALUES (?,?)";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setInt(1, uid);
		statement.setString(2, name);
		int count=statement.executeUpdate();
		System.out.println("no of rows afffected "+count);
		
		statement.close();
		connection.close();

	}

}
