import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsontojava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		ArrayList<customerdetails> acd=new ArrayList<customerdetails>();
		//customerdetails cd=new customerdetails();
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","Mihika@14");
		
		//Object of statement class will help us to execute queries
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from CustomerInfo where Location ='Asia';");
		while (rs.next())
		{
			customerdetails cd=new customerdetails();
			cd.setCourseName(rs.getString(1));
			cd.setPurchaseDate(rs.getString(2));
			cd.setAmount(rs.getInt(3));
			cd.setLocation(rs.getString(4));
			acd.add(cd);

		}
		
		for (int i=0;i<acd.size();i++)
		{
		ObjectMapper oj = new ObjectMapper();
		oj.writeValue(new File("D:\\Test_Automation_Architect\\Jsonava\\customerinfo"+i+".json"),acd.get(i));
		}
		conn.close();

	}

}
