
package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }
    
    private final String filename = "emails.txt";
    private List<String> mailList;
    private Histogram<String> histogram;
    
    private final void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        mailList = MailListReader.read(filename);
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    
    
    
}
