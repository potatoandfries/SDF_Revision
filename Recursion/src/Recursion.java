package Revision.Recursion.src;
/*Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
In the following example, recursion is used to add a range of numbers together by breaking it down 
into the simple task of adding two numbers: */

// for e.g 10! = 10 * 9! etc
public class Recursion {


    public static void main(String[] args) {
        
        int Result = sum(10);
        System.out.println(Result);

    }
    private static int sum(int i) {
            if (i>0){
                return i + sum(i-1);
            }else {
                return 0;
            }
    }

   

    
}
