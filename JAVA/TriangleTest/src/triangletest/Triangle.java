/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletest;

/**
 *
 * @author TREVOR
 */
public class Triangle {
  double breadth;
  double heigth;
  
  public Triangle(){
      breadth=10;
      heigth=5;
  }

    public Triangle(double breadth, double heigth) {
        this.breadth = breadth;
        this.heigth = heigth;
    }
 
      double Area(){
          
      return ((0.5)* breadth*heigth);
      
  }
  }

