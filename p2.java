import java.util.Scanner;

public class p2{

public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num = scan.nextInt();
   boolean s = true;
   
   for(int i = 2; i < num; i++){
     for(int j = i; j < num; j++){
      if(j%i == 0){
       s = false;
       }
      }
    if(s = true)
      System.out.print(i + ", ");
   }
   
 }//end of main
 
 /*public static boolean isPrime(int num){
   double sqr = Math.sqrt(num);
   
   for(int i = 2; i < sqr; i++){
      if(sqr%
   }
   
   
   return false;
 }//end of method*/
 
}// end of class 