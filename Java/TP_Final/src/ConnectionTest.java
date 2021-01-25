//STEFANY LISBOA DA SILVA CB3005551
//FELLIPE SOARES ROMANO CB3005411

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().getConnection();
         System.out.println("Connection working!");
         connection.close();
     }
}