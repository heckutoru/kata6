/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata6.model.*;
import kata6.view.*;

/**
 *
 * @author Héctor
 */
public class kata6 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
        execute();
    }
    
    public static void execute() throws IOException, ClassNotFoundException, SQLException{
        List<Mail> mailList = input("C:\\Users\\hecku\\Downloads\\emails.txt");
        HistogramBuilder<Mail> builderMail = new HistogramBuilder<>(mailList);
        List<Person> people = DataBaseList.read();
        HistogramBuilder<Person> builder = new HistogramBuilder<>(people);
        
        Histogram<Character> histogramGender =  builder.build(new Attribute<Person,Character>(){
            @Override
            public Character get(Person item){
                return item.getGender();
            }
        });
        new HistogramDisplay(histogramGender ,"Genero").execute();
                   
        Histogram<String> histogramWeight =  builder.build(new Attribute<Person,String>(){
            @Override
            public String get(Person item){
                return item.getWeight().toString();
            }
        });
        new HistogramDisplay(histogramWeight ,"Peso").execute();
    }
    
    public static List<Mail> input(String filename) throws IOException{
        return FileMailListReader.read(filename);
    }
    
}
