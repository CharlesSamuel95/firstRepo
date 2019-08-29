//Purpose: create patterns using loops

public class Patterns{
 public static void main(String[] args){
 
  p1();
  
  System.out.println();
  
  p2();
  
 }// end of main


  /* * 
  * * 
  * * * 
  * * * * 
  * * * * *
  
*/

 public static void p1(){
  String s = "";
  for(int i = 0; i < 5; i++){
   s += "* ";
   System.out.println(s);
  
  }
 }// end of method

 
 /*   *
     **
    ***    
   ****
  ***** 
*/
 
 public static void p2(){
  String s = "";
  
  for(int i = 0; i < 5; i++){
   
   for(int j = 5; j > i; j--){
    System.out.print(" ");
   }// end of inner loop
   
   s += "*";
   System.out.println(s);
  }// end of loop
 
 }// end of method


 public static void p3(){
 
 }// end of method


}// end of class