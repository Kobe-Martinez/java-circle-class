//Programmed by: Kobe Martinez
//Date written: 03 April 2021

//creating the Circle class
class Circle {
//Programmed by: Kobe Martinez
/** 

 * creating the two private class fields
 * both are set to double to produce decimals
 * final is set to var PI because it is a constant 
 */
   private double radius;
   private final double PI = 3.14159;
   
   /**
    * The Constructor created as requested
    * Receiving 1 parameter
    * assigned the parameter to radius
    */
   Circle(double ray1) {
      radius = ray1;
   }
   
   /**
    * The 1 setter as requested
    * sets the value of the radius
    */
   public void circleRadius(double ray1) {
      radius = ray1;      
   }
   
   /**
    * 1/4 getter methods
    * Returns value of radius
    */
   public double retrieveRadius() {
      return radius;
   } 
   
   /**
    * 2/4 getter methods
    * Returns value of area
    */
   public double retrieveArea() {
      return PI*radius*radius;
   }
   
   /**
    * 3/4 getter methods
    * Returns value of Diameter
    */
   public double retrieveDiameter() {
      return 2*radius;
   }
   
   /**
    * 4/4 getter methods
    * Returns value of Circumference
    */
   public double retrieveCircumference() {
      return 2*PI*radius;
   }

}   