import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      System.out.println("1 \nHello Human");
      printMenu();
      System.out.println("2 \nApples, Bananas, Coconuts");
      printMenu();
      System.out.println("3 \nGoodbye");

    }

    Scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
