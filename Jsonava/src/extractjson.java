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

public class extractjson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper om=new ObjectMapper();
		customerdetails  c= om.readValue(new File("D:\\Test_Automation_Architect\\Jsonava\\customerinfo0.json"),customerdetails.class);
		System.out.println(c.getCourseName());
	}

}
