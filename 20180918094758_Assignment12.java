
package assignment12;
import java.util.Scanner;

public class Assignment12 {

   
    public static void main(String[] args) {
          System.out.println("how many lines : ");
        Scanner Scanner = new Scanner (System.in);
       int  n= Scanner.nextInt();
       
       int i;
       int j;
     
      

       for (i=0 ;i<n; i++)
       {
           for(j=n; j>i; j--){
               
       System.out.print(" *");        
           }
           System.out.println("");
       for(int k=0; k<=i; k++){
           System.out.print(" ");
       }
    }
    }
    

    }
