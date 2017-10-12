/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
/**
 *
 * @author Sabyasachi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
     Scanner in = new Scanner(System.in) ;
     
     int choice;
     
     System.out.println("Choose among the follow:");
     System.out.println("1.Addition");
     System.out.println("2.Subtraction");
     System.out.println("3.Multiplication");
     System.out.println("4.Division");
     System.out.println("5.Power"); 
     choice  = in.nextInt();
     switch(choice)
     {
         case 1:
         {
             System.out.println("Addition:");
             double x,y;
             x = in.nextDouble();
             y = in.nextDouble();
             Add add = new Add(x,y);
             System.out.println(add.getAdd());
             break;
         }
         case 2:
         {
             System.out.println("Subtraction:");
             double x,y;
             x = in.nextDouble();
             y = in.nextDouble();
             Subtract sub = new Subtract(x,y);
             System.out.println(sub.getSubtract());
             break;
         }
         case 3:
         {
             System.out.println("Multiplication:");
             double x,y;
             x = in.nextDouble();
             y = in.nextDouble();
             Multiplication mul = new Multiplication(x,y);
             System.out.println(mul.getMultiplication());
             break;
         }
         case 4:
         {
             System.out.println("Division");
             double x,y;
             x = in.nextDouble();
             y = in.nextDouble();
             Division div = new Division(x,y);
             System.out.println(div.getDivision());
             break;
         }
         case 5:
         {
             System.out.println("Power:"); 
             double x,y;
             x = in.nextDouble();
             y = in.nextDouble();
             Power p = new Power(x,y);
             System.out.println(p.getPower());
             break;
         }
     }
    }
//    in.close();
}
