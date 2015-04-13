/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package createdelivery;


import java.util.*;
class Delivery {
int year;
int deliveryNo;
double weight;
int code;

Delivery(int year,int deliveryNo,double weight,int code){

}
public double displayFees(int c,double w){
double fees=0;
if(c==1){
if(w<5){
fees=12.00;
}
else if((w<20)&&(w>5)){
fees=16.50;
}
else if(w>20){
fees=22.00;
}
}
else if(c==2){
if(w<5){
fees=35.00;
}
else if(w>=5){
fees=47.95;
}
}
return fees;
}
}


public class CreateDelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.print("Enter year: ");
int year=input.nextInt();
while((year<2001)||(year>2025)){
System.out.println("Year should be in the range of (2001 - 2025).");
System.out.print("Please re-enter year: ");
year=input.nextInt();
}
System.out.print("Enter delivery no: ");
int no=input.nextInt();
while((no<1)||(no>9999)){
System.out.println("Delivery No should be in the range of (1 - 9999).");
System.out.print("Please re-enter delivery no: ");
no=input.nextInt();
}
System.out.print("Enter weight: ");
double w=input.nextDouble();
while((w<0.10)||(w>1000)){
System.out.println("Weight should be in the range of (0.10Pound - 100Pounds).");
System.out.print("Please re-enter weight: ");
w=input.nextDouble();
}
System.out.print("Enter delivery code: ");
int code=input.nextInt();
while((code<1)||(code>2)){
System.out.println("Code No should be either 1 or 2.");
System.out.print("Please re-enter code: ");
code=input.nextInt();
}
String num=Integer.toString(no);
String y=Integer.toString(year);
if(num.length()==1){
num="000"+num;
}
else if(num.length()==2){
num="00"+num;
}
else if(num.length()==3){
num="0"+num;
}
String delNo=year+num;
Delivery del=new Delivery(year,no,w,code);
double fees=del.displayFees(code,w);
System.out.println(code+" "+delNo+" "+w+" "+fees);
}

    }

