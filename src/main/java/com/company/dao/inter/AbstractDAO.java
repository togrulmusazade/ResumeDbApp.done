package com.company.dao.inter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public abstract class AbstractDAO {

    public  Connection connect() throws SQLException{

        String url="jdbc:mysql://localhost:3306/resume";
        String username="root";
        String password="elnurdeyanet1071";
        Connection c=DriverManager.getConnection(url, username, password);
        return c;
    }
    //elnurdeyanet1071



    public static void foo()throws Exception{Class.forName("com.mysql.jdbc.Driver");}
}