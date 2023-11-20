/*
 * PRINT THE AREA AND CIRCUMFERENCE OF A CIRCLE, GIVEN ITS RADIUS.
 */



public class CircleComputation {

    public static void main(String[] args) {
        // QN: it is given that you need 3 variables radius, area and circum.
        double circumference, radius, area;
        // QN: declare a double to hold Pi;  since its a constant its gotta be uppercase.
        final double PI = 3.14159265;

        //Assign a value to radius
        radius = 2.0; 
        //compute area and circumferemce
        area = PI * radius * radius;
        //if u wanna do pi*r^2 , u can use Math.pow(variable,number of power).
        //e.g Math.pow(radius,2)*Math.PI ;Math.PI is a thing already.
        circumference = 2.0 * PI *radius;
        
        //Print the Results
        System.out.println("The radius is "+ radius);
        System.out.println("The circumference is "+ circumference);
        System.out.println("The area is "+ area);



        
    }
    
}
