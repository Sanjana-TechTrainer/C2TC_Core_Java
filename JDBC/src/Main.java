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
		//String query="Select * from details";
		//String query="INSERT INTO details VALUES (" + uid + ", " +"\""+ name +"\"" + ");";
		String query="INSERT INTO details VALUES (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		//Statement statement=connection.createStatement();
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, uid);
		ps.setString(2, name);
		/*ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+": "+ rs.getString(2));
		}*/
		//int count=statement.executeUpdate(query);
		int count=ps.executeUpdate();
		System.out.println(count+" row(s) affected");
		ps.close();
		connection.close();

	}

}
