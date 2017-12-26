/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.awt.Container;
import java.awt.Dimension;
import kata6.model.Histogram;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.ApplicationFrame;


/**
 *
 * @author Héctor
 */
public class HistogramDisplay<T> extends ApplicationFrame{
    
    private final Histogram<T> histogram;
    private final String ejeX;
    
    public HistogramDisplay(Histogram<T> histogram, String eje) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        ejeX = eje;
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private Container createPanel(){
        ChartPanel charpanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return charpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("histograma JFreeChart", ejeX, "Nº de emails", 
                dataSet, PlotOrientation.VERTICAL, false, true, true);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (T key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "",(Comparable) key);
        }
        return dataSet;
    }
}
