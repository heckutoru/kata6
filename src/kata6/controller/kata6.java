/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.HistogramDisplay;
import kata6.view.HistogramBuilder;
import kata6.view.FileMailListReader;

/**
 *
 * @author Héctor
 */
public class kata6 {

    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        execute();
    }
    
    public static void execute() throws IOException{
        List<Mail> mailList = input("C:\\Users\\hecku\\Downloads\\emails.txt");
        Histogram<String> histogramDomain = builder.build(new Attribute<Mail,String>(){
            @Override
            public String get(Mail item){
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<String> histogramDomain = builder.build(new Attribute<Mail,Character>(){
            @Override
            public Character get(Mail item){
                return item.getMail().charAt(0);
            }
        });
        output(histogramDomain);
        output(histogramCharacter);
    }
    
    public static List<Mail> input(String filename) throws IOException{
        return FileMailListReader.read(filename);
    }
    
    public static void output(Histogram<String> histogram){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
