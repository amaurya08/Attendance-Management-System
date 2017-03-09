package project_faculty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;


public class attend {
		private String poolstudent[]={""};
		int i=0;
		attend(String year,String sec,String lecno,String type,faculty f)
		{
			try{    
			Connection con=new database().getdbms();
			Statement stmt=con.createStatement();  
			if(type.compareTo("LEC")==0)
			{
				
				String s1="";
				
					s1="select name from student where year=\""+year+"\" and section=\""+sec+"\"";
					System.out.println(s1);
					ResultSet rs=stmt.executeQuery(s1);
				
				while(rs.next())  
				{
					poolstudent=(String [])Arrays.copyOf(poolstudent,poolstudent.length+1);
					 poolstudent[i]=rs.getString("name");
					 i++;
				}	
				
			}
			else
			{
				 	String s1="";
						s1="select name from student where year=\""+year+"\" and subsection=\""+sec+"\"";
						
						ResultSet rs=stmt.executeQuery(s1);
						while(rs.next())
					{
						poolstudent=(String [])Arrays.copyOf(poolstudent,poolstudent.length+1);
						 poolstudent[i]=rs.getString("name");
						 i++;
					}  
				  
			}
			con.close();  
			}
					catch(Exception e1)
				 {
					System.out.println(e1);  
			   	 }
			}
		public static int check(String year,String sec,String lecno,String type,faculty f)
		{
			int flag=0;
			try{  
				Connection con=new database().getdbms();
				Statement stmt=con.createStatement();  
				
				String s1="";
				
					s1="select * from atimtable where year=\""+year+"\" and section=\""+sec+"\" and lecno=\""+lecno+"\" and type=\""+type+"\" and fshortname=\""+f.getshortname()+"\" and day=\""+f.getday()+"\"";
					
					ResultSet rs=stmt.executeQuery(s1);
					
				if(rs.next())
					flag=1;
				else
					flag=2;
				con.close();
			}
				catch(Exception e1)
			 {
				System.out.println(e1);  
		   	 }
			if(flag==1)
			 return 1;
			else
				return 0;
			}	
		public String[] getNames()
		{
			
			return poolstudent;
		}
		public static int markattendance(String s,faculty f)
		{
			int i=0;
			try{  
				Connection con=new database().getdbms();
				Statement stmt=con.createStatement();  
				String s1="select "+f.getsubcode()+" from student where name=\""+s+"\"";
				
					ResultSet rs=stmt.executeQuery(s1);
					while(rs.next())
					{
						i=rs.getInt(f.getsubcode());
					}
				con.close();
			}
				catch(Exception e1)
			 {
				System.out.println(e1);  
		   	 }
			i++;
			try
			{  
				Connection con=new database().getdbms();
				Statement stmt=con.createStatement();  
				String s1="update student set "+f.getsubcode()+"="+i+" where name=\""+s+"\"";
				stmt.executeUpdate(s1);
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);  
			}
		return 0;	
		}
}
