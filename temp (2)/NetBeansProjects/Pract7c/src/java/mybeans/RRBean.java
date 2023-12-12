/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybeans;

import jakarta.ejb.Stateless;
import java.sql.*;
@Stateless
public class RRBean {
public RRBean(){}
public String markenter(String id,String n, String s1,String s2){
    String msg;
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohan","root","root");
String query="insert into student values(?,?,?,?)";
PreparedStatement pst = con.prepareStatement(query);
pst.setString(1,id);
pst.setString(2,n);
pst.setString(3,s1);
pst.setString(4,s2);
pst.executeUpdate();

msg="Marks entered";
}
catch(Exception e){msg=""+e;}
return msg;
}
}