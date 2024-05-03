/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricitymanagment;


import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "amulya"); // replace the password according to your account
            s = c.createStatement();
            System.out.println("success");
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
