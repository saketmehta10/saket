import java.util.Scanner ;
import java.sql.*;
public class jdbc2{
    public static void main(String [] args )
{
    
    try 
    {    
       
         
        // loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
           int i=0;
            String nam="",add="";
    
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter id no");
            i=sc.nextInt();
            System.out.println("Enetr Name");
            nam=sc.nextLine();

            System.out.println("Enter Address");
            add=sc.nextLine();   
            
             String usrname ="root";
            String password="Saket@1035";

            //String q="Create table tbl ( id int primary key, Vname varchar(20),Address varchar(20))";
            String t="Insert into tbl value"+"("+i+nam+add+")"+";";
            String url="jdbc:mysql://localhost:3306/str";
          
          
            Connection con= DriverManager.getConnection(url,usrname,password);
        
            Statement st=con.createStatement();
            
            st.executeUpdate(t);
            con.close();
        }

            catch(Exception e)
        {
            e.printStackTrace();
        }
 
 }
}
