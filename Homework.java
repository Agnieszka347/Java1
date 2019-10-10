import java.util.Scanner;
import java.util.Arrays;


public class Homework {

    public static void main (String [] agrs){

//ad2.1 Application should ask us for item price. Next application should ask us for age. If age less than 6 years, calculate discount in //80%, If age more than 6 but less than 18, discount should be 25%, if age more than 65, discount should be 30%. In other cases there is no //discounts.


       /*Scanner scanner = new Scanner(System.in);
       System.out.println ("Enter price");
       double price = scanner.nextDouble();
       scanner.nextLine();
       System.out.println ("The price is" + price);
       System.out.println ("Enter your age");
       int age = scanner.nextInt();
       System.out.println ("Your age is" + age);

       double result=0;
         
         if (age <6) {
        System.out.println("You get 80 percent discount");
        result = (price - price*0.8);
        System.out.printf("Your actualy prise is %.2f%n",result);
        
       
        } 
       else if (age<18 && age>6) { 
       System.out.println("You get 25 percent discount");
       result = (price - price*0.25);
       System.out.printf("Your actual prise is %.2f%n",result);
       
        
        } else if (age>65) {
        System.out.println("You get 30 percent discount");
        result = (price - price*0.30);
        System.out.printf("Your actual prise is %.2f%n",result);
        
        
        } else if (age>18 && age<65) {
         System.out.println("No discounts");
         }*/


//ad2.2  try to implement next application: put as application parameter color of traffic lights. Using switch...case print out drivers //actions related to the color.


          /*System.out.println("Choose colors");
          Scanner scanner = new Scanner(System.in);
   
          String color= scanner.nextLine();

          switch (color) {
          case "red":
          System.out.println("Stop!");
          break;

          case"green":
          System.out.println("Go!");
          break;

          case"yellow":
          System.out.println("Be careful!");
          break;
          
          default:
          System.out.println("Wrong color!");
       
   }*/

//ad2.3 Write application, which create array of int. Fills array with numbers from 1 to 10 with while loop. Print array with //Arrays.toString(...) method.
        
               
           
                /* int[] array = new int[10];
                 int n = 0;
                 while(n<10){
                 array[n]=n+1;
                       n++;
                 }

                 System.out.println(Arrays.toString(array));*/


//ad2.4 Write application, which prints out all entered application parameters.


   
    /*int i =0;
    while (i<10) {
    System.out.println(i);
    i++; //od 0 do 9

  }*/


       
               

//ad2.5 Write application, which prints out all entered application parameters in reverse order

    /*int i = 9;
    while (i>=0) {
    System.out.println(i);
    i--;

  }*/



//ad.3.1 Using do..while loop printout numbers from 10 to 0.


   //1)   
          /*int i = 10;

	  do{
		  System.out.println("To jest petla");
		  i--;
	  }
	  while(i>0);
	  System.out.println("Koniec pêtli");*/

  //2)
         /*int i = 10;

	  do{
		  System.out.println("To jest petla");
		  i--;
	  }
	  while(i>20);
	  System.out.println("Koniec pêtli"); //To jest petla
                                              //Koniec pêtli*/

  //ad3.2  Using for with counter loop print out all application arguments.

       /*int i =10;
       for (i =10; i>=0; i--) {
       System.out.println(i);
      } // od 10 do 0*/
         



//ad.3.3 Using enhanced for loop (for-each loop) print out all application arguments.

         /*int[] primeNumber =new int[] {2,3,5,7,9,11}; 
         for (int Number:primeNumber) {
         System.out.println(Number);
       }*/


//ad.3.4 Calculate average value for array of numbers. For iterating over array use enhanced for loop.


               /* double[] array = {2,3,5,7,9,11};
                double sum =0;
                double avarage=0; 

                for(Double number : array){
                    sum+=number;
              } 
                avarage = sum/array.length; 
                System.out.printf("%.2f",avarage); */


//ad3.5  If you didn't manage out advanced task from previous lesson about Prime numbers - try to do it now. 


                /* int n = 0;
                 while (n<100) {
                  n++;
                 if (n>2 && n%2==0) {
                 continue; 
                 } else if (n>3 && n%3==0) {
                 continue;
                 } else if (n>5 && n%5==0) {
                 continue;    
                 } else if (n>7 && n%7==0) {
                 continue;
                 }
                 System.out.println(n);
             }*/        




    }


}

