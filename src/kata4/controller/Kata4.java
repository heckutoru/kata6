/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListreader;

/**
 *
 * @author Héctor
 */
public class Kata4 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String filename = "C:\\Users\\Entrar\\Downloads\\emails.txt";
        List<String> mailList = MailListreader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
