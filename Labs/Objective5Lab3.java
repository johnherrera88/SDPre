import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      int userNum = 0;

      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a number: ");

      userNum = input.nextInt();

      if(userNum > 0) {
        System.out.println(userNum + " is positive ");
      }

      if(userNum < 0) {
        System.out.println(userNum + " is negative ");
      }

      if(userNum == 0) {
        System.out.println(userNum + " is equal to zero ");
      }

  }
}
