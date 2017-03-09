package project_faculty;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;




import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class faculty {
	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
		//  Database credentials
	   	static final String USER = "root";
	   	static final String PASS = "hoot";
	   	private String fname;
	   	private String shortname;
	   	private String email;
	   	JTable j=new JTable();
	   	private	String pool[]={""};
	   	private String rawpool="default";
	   	private int i1=0;
	   	private int i=1;
	   	private String lecno;
	   	private String subcode;
	   	private String type;
	   	private String room;
	   	private String year;
	   	private String section;
	   	private String poolyear[]={""};//={"","","","","","","","","",""};
		private String poolsection[]={""};//={"","","","","","","","","",""};
		private String poollecno[]={""};//={"","","","","","","","","",""};;
		private String pooltype[]={""};
		private String day1="";
	
	//private String 
	
	faculty(String ema)
	{

		   Connection conn = null;
		   Statement stmt = null;
		   try{
			   DefaultTableModel model = new DefaultTableModel();
		        model.addColumn("lecture");
		        model.addColumn("Room");
		        model.addColumn("Section");
		        model.addColumn("Subject code");
		        model.addColumn("Type");
			      //STEP 2: Register JDBC driver
			     

			      //STEP 3: Open a connection
		       conn=new database().getdbms();

			      //STEP 4: Execute a query
			      stmt = conn.createStatement();
			      String sql;
			      
			      Calendar calendar = Calendar.getInstance();
			      int day = calendar.get(Calendar.DAY_OF_WEEK); 
			      switch(day)
			      {
			      case 1:
			    	  day1="SUN";
			    	  break;
			      case 2:
			    	  day1="MON";
			    	  break;
			      case 3:
			    	  day1="TUE";
			    	  break;
			      case 4:
			    	  day1="WED";
			    	  break;
			      case 5:
			    	  day1="THU";
			    	  break;
			      case 6:
			    	  day1="FRI";
			    	  break;
			      case 7:
			    	  day1="SAT";
			    	  break;
			      }
			      sql = "SELECT name,shortname,email from login where email=\""+ema+"\"";
			      
			      ResultSet rs = stmt.executeQuery(sql);
			      //STEP 5: Extract data from result set
			     
			    	 System.out.println("No Record");
			      else if(!rs.next())
			      {
			    	  fname=rs.getString("name");
			    	  email=rs.getString("email");
			    	  shortname=rs.getString("shortname");
			      }
			      sql="select lecno,subcode,type,room,section,year from atimtable where fshortname=\""+shortname+"\" and day=\""+day1+"\"";
			      
			      rs=stmt.executeQuery(sql);
			      if(!rs.next())
				    	 System.out.println("No Record");
				      else
				      do{
				    	  lecno=rs.getString("lecno");
				    	  room=rs.getString("room");
				    	  section=rs.getString("section");
				    	  subcode=rs.getString("subcode");
				    	  year=rs.getString("year");
				    	  type=rs.getString("type");
				    	  rawpool=lecno+"  -  "+room+"  -  "+section+"  -  "+subcode;
				    	  
				    	  pool=(String[]) Arrays.copyOf( pool, pool.length+1);
				    	  pool[i1]=rawpool;
				    	  
				    	  poollecno=(String[]) Arrays.copyOf(poollecno,poollecno.length+1);
				    	  poollecno[i]=lecno;
				    	  
				    	  poolyear=(String [])Arrays.copyOf(poolyear,poolyear.length+1);
				    	  poolyear[i]=year;
				    	  
				    	  poolsection=(String [])Arrays.copyOf(poolsection,poolsection.length+1);
				    	  poolsection[i]=section;
				    	  
				    	  pooltype=(String [])Arrays.copyOf(pooltype,pooltype.length+1);
				    	  pooltype[i]=type;
				    	  i++;
				    	  i1++;
				      } while(rs.next())	;  
			      
			      //STEP 6: Clean-up environment
			      rs.close();
			      stmt.close();
			      conn.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
 
	}
	public String getFname()
	{
		return fname;
	}
	public String getEmail()
	{
		return email;
	}
	public String getshortname()
	{
		return shortname;
	}
	public String getday()
	{
		return day1;
	}
	public String getsubcode()
	{
		return subcode;
	}
	
public String [] getPool()
{
	return pool;
	}
public String [] getPoolYear()
{
	return poolyear;
	}
public String [] getPoolsection()
{
	return poolsection;
	}
public String [] getPoollec()
{
	
	return poollecno;
}
public String [] getPooltype()
{
	
	return pooltype;
}
public String current()
{
	LocalDateTime s=LocalDateTime.now();
	int h=s.getHour();
	
	String s1="";
	int cl=0;
	String day1="";
    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK); 
    switch(day)
    {
    case 1:
  	  day1="SUN";
  	  break;
    case 2:
  	  day1="MON";
  	  break;
    case 3:
  	  day1="TUE";
  	  break;
    case 4:
  	  day1="WED";
  	  break;
    case 5:
  	  day1="THU";
  	  break;
    case 6:
  	  day1="FRI";
  	  break;
    case 7:
  	  day1="SAT";
  	  break;
    }

	//System.out.println(h);
if(h>=8&&h<9)
{
	cl=1;
}
else
if(h>=9&&h<10)
{
	cl=2;
}
else
if(h>=10&&h<11)
{
	cl=3;
}
else
if(h>=12&&h<13)
{
	cl=4;
}
else
if(h>=13&&h<14)
{
	cl=5;
}
else
if(h>=14&&h<15)
{
	cl=6;
}
else
if(h>=15&&h<16)
{
	cl=7;
}

try{  
	Connection con=new database().getdbms();
	Statement stmt=con.createStatement();  
	String s11="select lecno,subcode,section,room from atimtable where lecno="+cl+" and fshortname=\""+shortname+"\""+" and day=\""+day1+"\"";
	
	ResultSet rs=stmt.executeQuery(s11);
	if(rs.next())  
	{
		s1=rs.getString("lecno")+" - "+rs.getString("room")+" - "+rs.getString("section")+" - "+rs.getString("subcode");
	}
	else
		s1="Free Lecture :) ";
	con.close();  
	}
	catch(Exception e1)
	 {
		System.out.println(e1);  
  	 }
return s1;
}

}
