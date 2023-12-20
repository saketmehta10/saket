import java.sql.*;
public class jdbc1 {
    public static void main(String [] args )
{
    
    try 
    {    
        String url="jdbc:mysql://localhost:3306/str";
         
        // loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            String usrname ="root";
            String password="Saket@1035";
          String q="Create table tbl ( id int primary key, Vname varchar(20),Address varchar(20))";
           
          Connection con= DriverManager.getConnection(url,usrname,password);
        
            
        Statement st=con.createStatement();
            
            st.executeUpdate(q);
            con.close();
        }

            catch(Exception e)
        {
            e.printStackTrace();
        }
 
 }
}
