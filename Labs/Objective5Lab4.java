  import java.util.Scanner;

  public class Objective5Lab4 {
    public static void main(String[] args) {
      int Number = 0;

      Scanner input = new Scanner(System.in);
      System.out.println("Select a number: ");

      Number = input.nextInt();

      if(Number % 2 == 0) {
        System.out.println(Number + " is even ");
      }

      if(Number % 2 >= 1) {
        System.out.println(Number + " is odd ");
      }

  }
}
