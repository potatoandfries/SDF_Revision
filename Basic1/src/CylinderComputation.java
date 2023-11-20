
// Prime example of inheritance 
public class CylinderComputation extends CircleComputation{
    // example of encapsulaion cause we make this shit private ya know what im saying.
    private double height;
    // my initial thought: do i need to public static void main this ?
    // Idk how to make a method?

    public CylinderComputation(double radius,double height ) {
        //this would be considered a method declaration
        //with a return type double
        // () means that it does not accept any parameters.

        super(radius); // calls the constructor of the superclass.
        this.height = height;

    }
    // question time : why is the line of code needed?   why cant u just double cylinderArea(){}  for e.g
    public double cylinderArea(){
        double circleArea = super(); 
        // Access compute area method from superclass, use super.zLmethod nameLz ; Lz is nothing
        //if u want to call the constructor super(constructor name)


        // btw this is doomed to fail, why? 
    } 

    
}
