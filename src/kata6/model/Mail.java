/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.model;

import java.lang.String;
/**
 *
 * @author Entrar
 */
public class Mail {
    private String mail;
    private Integer id;
    
    public Mail(String mail,Integer id){
        this.mail = mail;
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getMail() {
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
