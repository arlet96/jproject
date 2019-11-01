/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;


/**
 *
 * @author Arlet
 */
public class Miniproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //Tester for Factorial. For prove eliminate /**/
            
            /*System.out.println("Print in console the number:");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if(n<0){ 
                System.out.println("the number must be positive");return;}
           
            System.out.println(FactorialRecursive(n));
            System.out.println(FactorialIterative(n));
           */
            
            // Tester A
            //For prove eliminated //
          // A(5);
             
           // System.out.println(Factorial(2));
        }catch(Exception ex){System.out.println("Error " + ex);}
        
        
    }
    
    public static long FactorialRecursive(long number){
        if(number > 1){
            System.out.print( number + " * ");
            return number*FactorialRecursive(number-1);
            }
        else{ System.out.print(1+"\n"); return 1;}
    }
    
    public static long FactorialIterative(long number){
    
        long res = 1;
        System.out.print(res );
        for (int i = 2; i <= number; i++) {
            System.out.print(" * " + i );
            res*=i;
        }
         System.out.print("\n" );
        return res;
    }

    public static void A(int count)
    {
        /* In this function I tried to apply the must of the theory that i know, which is
         OOP, nested classes, data structures(in this case I use the stack alredy defined in java's libraries
        cicles and generics objects*/
        class Point{
            public int x;
            public int y;
            
            public Point(int X, int Y){x = X; y=Y;}
            
            public void Print(){System.out.println("X: "+ x+" Y: "+y);}
            public Point Sum(Point p1){return new Point(this.x+p1.x,this.y+p1.y);}
        }
       
        
        Stack<Point> f = new Stack<>();
        Random r = new Random();
        Point fig;
        System.out.println("In");
        for (int i = 0; i < count; i++) {
           fig = new Point( r.nextInt(50), r.nextInt(40));
           fig.Print();
           f.push(fig);
        }
       try{
           
           while(!f.empty()){
               
             System.out.println("Sum"); f.firstElement().Print();f.lastElement().Print();   
             f.firstElement().Sum(f.lastElement()).Print();
               
              System.out.println("Out"); 
              f.pop().Print();           
           }
       }catch(Exception ex){System.out.println("ERROR");}
        
    }
    
    public void tester()
    {
    }
}
