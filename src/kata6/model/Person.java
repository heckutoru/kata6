/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Héctor Déniz Álvarez (Heckutoru)
 */
public class Person {
    
    private final Integer id;
    private final String name;
    private final Character gender;
    private final String birthday;
    private final String mail;
    private final Float weight;
    
    public Person(Integer id, String name, Character gender, String birthday, String mail, Float weight) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.mail = mail;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getMail() {
        return mail;
    }

    public Float getWeight() {
        return weight;
    }
    
}
