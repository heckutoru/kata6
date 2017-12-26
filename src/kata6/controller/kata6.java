/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.util.List;
import kata6.model.*;
import kata6.view.*;

/**
 *
 * @author Héctor
 */
public class kata6 {

    public static void main(String[] args) throws IOException{
        execute();
    }
    
    public static void execute() throws IOException{
        List<Mail> mailList = input("C:\\Users\\hecku\\Downloads\\emails.txt");
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(mailList);
        
        Histogram<Character> histogramLetters =  builder.build(new Attribute<Mail,Character>(){
            @Override
            public Character get(Mail item){
                return item.getMail().charAt(0);
            }
        });
        new HistogramDisplay(histogramLetters,"Primer caracter").execute();
                   
        Histogram<String> histogramDomain =  builder.build(new Attribute<Mail,String>(){
            @Override
            public String get(Mail item){
                return item.getMail().split("@")[1];
            }
        });
        new HistogramDisplay(histogramDomain,"Dominios").execute();
    }
    
    public static List<Mail> input(String filename) throws IOException{
        return FileMailListReader.read(filename);
    }
    
}
