
import java.sql.*;

public class OracleConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement st= con.createStatement();
		String sql="select * from employees where employee_id =100";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		/*String Host = "localhost";
		String port = "1521";

		//String url = "jdbc:oracle:thin:@HostName:1521:OSid"; 
		//(where HostName is the host, 1521 is the port and OSid is the sid) 

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/dba",	"hr","hr");*/
		
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@"+Host+":"+port+":"+"dba", "hr",	"hr");
		
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@"+Host+":"+port+"dba", "hr",	"hr");
		
//		Connection con = DriverManager.getConnection("jdbc:Oraclesqldeveloper://" + host + ":" + port + "/dba", "hr",	"hr");
	}

}
