import java.sql.*;


public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost:3306/mtech";
   static final String USER = "root";
   static final String PASS = "@aftab786";
   static final String QUERY = "SELECT * FROM student";

   public static void main(String[] args) throws Exception{
      try {
         Class.forName("com.mysql.jdbc.Driver");  
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         System.out.println("Database connected!");
         
         
       } catch (Exception e) {
            //throw new IllegalStateException("Cannot connect the database!", e);
            e.printStackTrace();
       }
      /* Open a connection
      try{
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);           
         while(rs.next()){
         //Display values
            System.out.print("RNO: " + rs.getInt("rno"));
            System.out.print(", Name: " + rs.getString("sname"));
            System.out.println(", E-mail: " + rs.getString("email"));
            }
         conn.close();
      } catch (Exception e) {
         e.printStackTrace();
      } */
   }
}