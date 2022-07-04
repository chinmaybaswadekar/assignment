package TDD_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class User {
    String email;
    String password;
    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
}

public class Question_3 {
  public static boolean checkuser(String email,String password) throws Exception{
    boolean userfound=false;
      List<User> ulist=new ArrayList<>();
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","root");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from user");
      while (rs.next()) {
          ulist.add(new User(rs.getString(email),rs.getString(password)));
      }
      for (User u:ulist) {
          if (u.email.equals(email) &&u.password.equals(password)) {
              userfound=true;
          }
      }
    return userfound;
  }

}