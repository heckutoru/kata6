/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.util.List;
import kata6.model.*;

/**
 *
 * @author Entrar
 */
public class HistogramBuilder<T> {
    private final List<T> items;
    
    public HistogramBuilder(List<T> items){
        this.items = items;
    }
    
    public<A> Histogram<A> build(Attribute<T,A>	attribute){	
	Histogram<A> histo = new Histogram<>();
	for(T item:items){	
            A value = attribute.get(item);	
            histo.increment(value);
	}
        return histo;
    }
    
}
