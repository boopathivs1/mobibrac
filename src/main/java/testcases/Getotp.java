package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Getotp {
  @Test
  public static String getOtp()
  {
	  String Otp="";
  try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		System.out.println("------------------------------------");
		Connection con =  DriverManager.getConnection("DB_URL","RIB_UAT_APP_USER_R2","rib_UAT_APP_USER_R2321");
		Statement stmt=con.createStatement();  
		
//		ResultSet rs=stmt.executeQuery("select * from user_otp_maintenance where status_id='PENDING' order by generated_datetime desc");  

		//select Otp_number from MyTbl where rownum = 1
		ResultSet rs=stmt.executeQuery("select * from user_otp_maintenance where cif_number='00117434'and status_id='PENDING' and ROWNUM <= 1 order by id desc");  
		
		System.out.println(rs +"value");
		System.out.println("------Result fetched---------");
		
		while(rs.next())  {
			
			Otp =rs.getString("otp_number");
			System.out.println(Otp+"finalvalue");

		}
		
		stmt.close();
		con.close(); 
	}
  
catch(Exception e){
	System.out.println(e);
}  
  return Otp;

}  
}

