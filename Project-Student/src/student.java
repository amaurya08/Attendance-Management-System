import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class student 
{
private String regno;
private String name;
private String dept;
private int year;
private String section;
private String subsection;
private String college;
private int sub1;
private int sub2;
private int sub3;
private int sub4;
private int sub5;
private int sub6;
private int sub7;
private int sub8;
private int sub9;
private int sub10;
private int onl;
private int proskep;
private int total;
private int lectures;
student(String reg)
{
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/mydb","root","hoot4813");    
		
		String sql="select * from student where regid=\""+reg+"\"";
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery(sql);
		if(!rs.next())
			System.out.println("G TO Hell");
		else
		{
		 regno=rs.getString("regid");
		name=rs.getString("name");
		college=rs.getString("college");
		year=(rs.getInt("year"));
		dept=rs.getString("department");
		section=rs.getString("section");
		subsection=rs.getString("subsection");
		sub1=rs.getInt("4cs1");
		sub2=rs.getInt("4cs2");
		sub3=rs.getInt("4cs3");
		sub4=rs.getInt("4cs4");
		sub5=rs.getInt("4cs5");
		sub6=rs.getInt("4cs6");
		sub7=rs.getInt("4cs7");
		sub8=rs.getInt("4cs8");
		sub9=rs.getInt("4cs9");
		sub10=rs.getInt("4cs10");
		onl=rs.getInt("online");
		proskep=rs.getInt("proskep");
		total=rs.getInt("total");
		lectures=rs.getInt("lectures");
		}
		con.close(); 
		}
		catch(Exception e){ System.out.println(e);}  
}
public String getRegno()
{
	return regno;
}
public String getName()
{
	return name;
}
public String getCollege()
{
	return college;
}
public int getYear()
{
	return year;
}
public String getDepartment()
{
	return dept;
}
public String getSection()
{
	return section;
}
public String getSubSection()
{
	return subsection;
}
public int getSubject1(){
	return sub1;
}
public int getSubject2(){
	return sub2;
}
public int getSubject3(){
	return sub3;
}
public int getSubject4(){
	return sub4;
}
public int getSubject5(){
	return sub5;
}
public int getSubject6(){
	return sub6;
}
public int getSubject7(){
	return sub7;
}
public int getSubject8(){
	return sub8;
}
public int getSubject9(){
	return sub9;
}
public int getSubject10(){
	return sub10 ;
}
public int getOnl(){
	return onl;
}
public int getProskep(){
	return proskep;
}
public int getTotal(){
	return total;
}
public int sum()
{
	return (sub1+sub2+sub3+sub4+sub5+sub6+sub7+sub8+sub9+sub10+onl+proskep);
}
public int predict()
{
	return (lectures-sum());
}
public float percentage()
{
	
	return (((float)sum()/(float)total)*100);
}

}
