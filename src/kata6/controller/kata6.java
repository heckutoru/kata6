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
import kata6.view.HistogramDisplay;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListreader;

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
        List<String> mailList = input("C:\\Users\\hecku\\Downloads\\emails.txt");
        Histogram<String> histogram = process(mailList);
        output(histogram);
    }
    
    public static List<String> input(String filename) throws IOException{
        return MailListreader.read(filename);
    }
    
    public static Histogram<String> process(List<String> mailList){
        return MailHistogramBuilder.build(mailList);
    }
    
    public static void output(Histogram<String> histogram){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
