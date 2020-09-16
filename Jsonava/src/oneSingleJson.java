import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class oneSingleJson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		JSONArray js=new JSONArray();
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
		Gson g=new Gson();
		String jsonString=g.toJson(acd.get(i));
		js.add(jsonString);
		
		}
		//Create json string for Java Object
		
		//Json simple
		JSONObject jo=new JSONObject();
		jo.put("data",js);
		String unescapeString=StringEscapeUtils.unescapeJava(jo.toJSONString());
		String string1= unescapeString.replace("\"{", "{");
		String finalstring=string1.replace("}\"", "}");
		System.out.println(finalstring);		
		try(FileWriter file=new FileWriter("D:\\Test_Automation_Architect\\Jsonava\\finalcustinfo.json"))
				{
			file.write(finalstring);
		}
		
		//conn.close();

	}

}
