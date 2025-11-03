public class hape
{
    public static void main(String[] args)
    {
     // Scanner input = new Scanner(System.in);
        double area = calculateArea(4.5);
        System.out.println(" Area of the circle with a radius of 4.5 is " + area);
        area =calculateArea(9.8,6.5);
         System.out.println(" Area of the ractangle with side lengths 9.8 and 6.5 is " + area);
         area =calculateArea(3.1, 2.3, 3.5);
         
         System.out.println(" Area of the trapezoid with bases 3.1 and 2.3 and a hieght of 3.5 is " + area);
            
    } 
       static double calculateArea(double radius)
       {
          double areaOfCircle = Math.PI * radius * radius;
          return areaOfCircle;
       }  
          static double calculateArea(double width , double hieght)
       {
          double areaOfRect= width * hieght ;
          return areaOfRect;
       } 
           static double calculateArea(double base1, double base2, double hieght)
       {
          double areaOfTrape = (base1+ base2)/2 * hieght;
          return areaOfTrape;
       }       

    
  
}
