/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Entrar
 */
public class MailListreader {
    
    public static List<String> read(String name) throws FileNotFoundException, IOException{
        ArrayList<String> mailList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(name)));
        String mail;
        while((mail = reader.readLine()) != null){
            mailList.add(mail);
        }
        reader.close();
        return mailList;
    }
}
