/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dj.vs.producer;


public class Producer extends DJ {
    private String ProducerName;
    private String RecordLabel;

    public Producer(String ProducerName, String RecordLabel ,String DjName, String MixTape ) {
        super(DjName, MixTape);
        
        this.ProducerName = ProducerName;
        this.RecordLabel = RecordLabel;
    }

    public String getProducerName() {
        return ProducerName;
    }

    public String getRecordLabel() {
        return RecordLabel;
    }
    @Override
    public void Display(){ 
        super.Display();
        System.out.println(getProducerName()+" "+getRecordLabel());
        
    }
    
}
