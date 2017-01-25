
import java.util.Scanner;
class Teron {

//Began Coding for my first project
public static void main (String[] args){
//Variable Declared 
int myNum;
  int swithcedNum = 0;
  Scanner input = new Scanner(System.in);
  myNum=input.nextInt();
  // While loop entered
  while(myNum!=0){
   //Creating statements  
    swithcedNum = swithcedNum * 10;
    swithcedNum = swithcedNum + myNum%10;
    myNum = myNum/10;
  }
  System.out.println(swithcedNum);
  
}
}
