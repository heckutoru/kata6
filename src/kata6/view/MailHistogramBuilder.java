/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;


/**
 *
 * @author Entrar
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> mail) {
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            if(new Mail(mail1).getDomain().length() > 0){
                histo.increment(new Mail(mail1).getDomain());
            }
        }
        return histo;
    }
}
