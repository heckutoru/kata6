/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

import java.lang.String;
/**
 *
 * @author Entrar
 */
public class Mail {
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String get() {
        return mail;
    }
    
    public String getDomain() {
        String[] mailSplited = mail.split("@");
        if(mailSplited.length >= 2){
            return mailSplited[1];
        } else {
            return "";
        }
    }
}
