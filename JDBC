// Add Driver file in CLASS PATH 
import java.sql.*;

public class Conn {
  public static void main(String args[]) throws Exception{
    // Load's Only the Class Hence Executes the Static BLOCK only if defined static{}
	Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","12qwaszx");
    Statement st=con.createStatement();
    
    //Insertion using PrepareStatement 
    PreparedStatement ps=con.prepareStatement("INSERT INTO Custom VALUES (?,?)");
    ps.setInt(1,725);
    ps.setString(2,"John");
    ps.executeUpdate();
    
    ResultSet rs=st.executeQuery("SELECT * FROM Custom"); // DQL
    //int count=st.executeUpdate("CREATE TABLE Custom(ID int,Name Varchar(255))");    // Shifting pointer to next Row AND Returns TRUE/FALSE 
    
    
    while(rs.next()) {
    String data=rs.getInt(1)+" : "+rs.getString(2);// rs.getString("first_name");
    System.out.println(data);
    }
    st.close();
    con.close();
    return;
  }
}
