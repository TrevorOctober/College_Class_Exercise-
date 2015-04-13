/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkup.tester;

/**
 *
 * @author TREVOR
 */
public class checkup {
    private String PatientNumber;
    private double systolic,diastolic;
    private double LDL,HDL;

    public checkup(String PatientNumber, double systolic, double diastolic, double LDL, double HDL) {
        this.PatientNumber = PatientNumber;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.LDL = LDL;
        this.HDL = HDL;
    }

    public double getHDL() {
        return HDL;
    }

    public void setHDL(double HDL) {
        this.HDL = HDL;
    }

    public double getLDL() {
        return LDL;
    }

    public void setLDL(double LDL) {
        this.LDL = LDL;
    }

    public String getPatientNumber() {
        return PatientNumber;
    }

    public void setPatientNumber(String PatientNumber) {
        this.PatientNumber = PatientNumber;
    }

    public double getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(double diastolic) {
        this.diastolic = diastolic;
    }

    public double getSystolic() {
        return systolic;
    }

    public void setSystolic(double systolic) {
        this.systolic = systolic;
    }
     public double computerRatio(){
         return getLDL() /getHDL() ;
         
     }
     public void explainRatio(){
         if(computerRatio()<=3.5)
         System.out.println("good cholesterol");    
     }
}
