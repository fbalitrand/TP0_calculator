/*
 * Flavie Balitrand
* TDC
* TP0
* 27/09/21
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author Flavie BALITRAND
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operateur;
        int operande1;
        int operande2;  
        float total;
        total = 0;
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator:\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        operateur=sc.nextInt();
        
        if (operateur!=1 ^ operateur!=2 ^ operateur!=5 ^ operateur!=3 ^ operateur!=4)
                { System.err.println("Error, you used a wrong number");
                System.exit(0);
        }
        
        System.out.println("Please enter the first number:");
        operande1=sc.nextInt();
        
        System.out.println("Please enter the second number:");
        operande2=sc.nextInt();
        
        if (operateur==1) {
        total= operande1+operande2;  
        }
        
        else if (operateur==2) {
            total= operande1-operande2;
        }
        
        else if (operateur==3) {
            total= operande1*operande2;
        }
        
        else if (operateur==4) {
            total= operande1/operande2;
        }
        
        else if (operateur==5){
            total= operande1 % operande2;
        }
            
        
        System.out.println("The answer is: " + total);
        
    }
    
}
