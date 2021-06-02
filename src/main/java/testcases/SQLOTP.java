package testcases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLOTP {
	
	
	        public static void main(String args[]) throws InterruptedException
	        {

	            try
	            {
	            	
                    String userName = "RIB_UAT_APP_USER_R2";
	                String password = "rib_UAT_APP_USER_R2321";

//		    	instance=SANDCASTLE01

	                String url = "jdbc:oracle:thin:@10.5.30.200:1590;BRAC_UAT_R2";
System.out.println("started");


Class.forName("oracle.jdbc.driver.OracleDriver");
	                Connection conn = DriverManager.getConnection(url,userName,password);
	                
	                System.out.println("connection established");

	                // our SQL SELECT query.
	                // if you only need a few columns, specify them by name instead of using "*"
//		      String query = "SELECT * from Audit.Answers where id=4";

	                String query = "select * from user_otp_maintenance where status_id='PENDING' order by generated_datetime desc";
//	                String query1 = "SELECT Description from dbo.Assistance where id=1";

	                // create the java statement
	                Statement st = conn.createStatement();

	                // execute the query, and get a java resultset
	                ResultSet rs = st.executeQuery(query);


	                // iterate through the java resultset
	                while (rs.next())
	                {
	                    Integer strName=rs.getInt(1);
//		        int id = rs.getInt("id");
//		        int firstName = rs.getInt("UnitOfMeasureId");
//		        int lastName = rs.getInt("InputOptionTypeId");
//		        int created = rs.getInt("CreatedBy");
//		        Date createdDate = rs.getDate("CreatedDate");
//		        String strModifyBy = rs.getString("ModifyBy");
//		        String Modify=rs.getString("ModifiedDat");

	                    // print the results
	                    System.out.format("%s\n",strName);

	                }
	                st.close();
	            }
	            catch (Exception e)
	            {
	                System.err.println("Got an exception! ");
	                System.err.println(e.getMessage());
	            }
	        }
	}


