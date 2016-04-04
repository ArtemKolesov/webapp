package com.epam.kolesov.trash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.NamingException;

import com.epam.kolesov1.entity.Post;

public class MyNigga {
	public static void main(String[] args) throws NamingException, SQLException, ClassNotFoundException  {
//		Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/blog";
		Properties info = new Properties( );
		info.put( "user", "admin" );
		info.put( "password", "admin" );
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog?autoReconnect=true&useSSL=false","admin","admin");
//		List<Crew> crews = new ArrayList<Crew>();
//		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
//		DBManager manager = DBManager.getInstance();
		
			st = conn.createStatement();
			rs = st.executeQuery("select * from post");
			Post p = new Post();
			rs.next();
			p.setId(rs.getInt(1));
			p.setTitle(rs.getString(2));
			p.setContent(rs.getString(3));
			p.setPostDate(rs.getTimestamp(4));
//			conn.commit();
		
			rs.close();
			st.close();
			conn.close();
		System.out.println(p);
	}	
}
