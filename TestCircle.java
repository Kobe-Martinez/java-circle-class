//Programmed by: Kobe Martinez
//Date written: 03 April 2021
import java.util.*;
import java.util.Scanner;

public class TestCircle 
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the radius of the circle: ");
      double ray1 = scan.nextDouble();
      Circle x = new Circle(ray1); 
      
      System.out.printf("\nThe Area of the circle is: %.3f", x.retrieveArea());
      System.out.printf("\nThe Diameter of the circle is: %.3f", x.retrieveDiameter());
      System.out.printf("\nThe Circumference of the circle is: %.3f", x.retrieveCircumference());
   }
}