/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kata6.model.*;
import kata6.view.*;

/**
 *
 * @author Héctor Déniz Álvarez (Heckutoru)
 */
public class DataBaseList {
    
    public static List<Person> read () throws ClassNotFoundException, SQLException{
        List<Person> listPerson = new ArrayList<>();	
        Class.forName("org.sqlite.JDBC");	
        Connection connec = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hecku\\Downloads\\KATA.sDB");	
        Statement st = connec.createStatement();	
        String query = "SELECT * FROM PEOPLE";	
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Integer id = rs.getInt(1);
            String name = rs.getString(2);
            Character gender = rs.getString(3).charAt(0);
            String birthday = rs.getString(4);
            String mail = rs.getString(6);
            Float weight = rs.getFloat(5);
            listPerson.add(new Person(id,name,gender,birthday, mail, weight));
        }
        
        return listPerson;
    }
}
