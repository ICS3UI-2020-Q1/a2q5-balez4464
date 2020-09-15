import java.util.Scanner;
/**
 *This program tells the user wheather to say fizz, buzz or fizz buzz
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number to play FizzBuzz");
    //allows user to enter number
    int usersNumber = input.nextInt();

    //intergers for dividng by 3 and five
    int divByThree = usersNumber % 3;
    int divByFive = usersNumber % 5;

    //Calculates if its only divisible by 3
    if(divByThree == 0 && divByFive != 0){
      System.out.println("You should say Fizz");
      //Calculates if its only divisible by 5
    } else if(divByFive == 0 && divByThree != 0){
      System.out.println("You should say Buzz");
      //Calculates if its both divisible by 3 and 5
    } else if(divByThree == 0 && divByFive == 0){
      System.out.println("You should say FizzBuzz");
      //Calculates if its divisible by neither 3 or 5
    } else if(divByThree != 0 && divByFive !=0){
      System.out.println("You should say " + usersNumber);
    } 

  }
}
