package client;
import java.sql.*;

public class Main {
	public static void main(String[] args){
		
		Connection con = null;
		Statement str = null;
		ResultSet row;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String url = "jdbc:mysql://118.166.86.15:3306/yap";
		String username = "yap";
		String password = "456121";
		
		System.out.println("Connecting database...");
	    try {
	    	System.out.println("Database connected!");
			con = DriverManager.getConnection(url, username, password);
			str = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String st = String.format(
					"SELECT * FROM account"
			);
			row = str.executeQuery(st);
			
			while(row.next()){
				System.out.println(row.getString("acc"));
			}
			
		} catch (SQLException e) {
			throw new RuntimeException("Cannot connect the database!", e);
		}
		
	}
}
