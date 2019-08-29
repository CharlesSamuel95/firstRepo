
public class Sorting{
 public static void main(String[] args){
  int[] list = {2,3,5,4,1};
  selectionSort(list);
  
 }// end of main

 public static void selectionSort(int[] array){
  int number = 0;
  int index = 0;
  
  for(int i = 0; i < array.length - 1; i++){   
   number = array[i];
   index = i;
   
   for(int j = i+1; j < array.length; j++){
    if(number > array[j]){
     number = array[j];
     index = j;
     }
    } 
   if(index != i){
     array[index] = array[i];
     array[i] = number;
   }    
   
   
  }// end of loop
  for(int i = 0; i < array.length; i++)
   System.out.print(array[i] + " ");
 
 }// end of method
 
 public static void insertionSort(int[] list){
 
 }// end of method

}// end of class