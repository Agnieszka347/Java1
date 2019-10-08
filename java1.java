import java.util.Scanner;

public class Java1 {
     
    public static void main(String[] args) {
        /*int age = 19;
        System.out.println("Masz " + age + " lat.");
        System.out.println(age + " lat to piêkny wiek.");
        System.out.println("Dodatkowo " + age + " to liczba pierwsza.");
        System.out.println("Liczba która nastêpuje po " + age + " to " + (age+1));
    }
}*/


       /*public static void main(String[] args) {
            System.out.println("I like to write Java code!");
            String Name = "Jan Nowak"; 
            System.out.println("Nice to meet you," +Name+"!");*/

      

            Scanner scanner = new Scanner (System.in);
            System.out.println ("Enter first number");
            int a = scanner.nextInt();
            System.out.println ("Enter next number");
            int b = scanner.nextInt();
            System.out.println(a+"*"+b+"="+(a*b));

    }
}