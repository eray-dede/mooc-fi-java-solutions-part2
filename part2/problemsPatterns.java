package part2;
import java.util.Scanner;

public class problemsPatterns {

  public static void main(String[] args) {
    //squared
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter a number:");
    int number = Integer.valueOf(reader.nextLine());

    int square = number*number;
    System.out.println("The square of the number you have entered: " + square);

    //square root of sum
    Scanner reader1 = new Scanner(System.in);

    System.out.println("Enter two numbers:");
    int number1 = Integer.valueOf(reader1.nextLine());
    int number2 = Integer.valueOf(reader1.nextLine());

    int sum= number1 + number2;
    double sqrtSum = Math.sqrt(sum);

    System.out.println("The square root of sum of 2 numbers: " + sqrtSum);

    // absolute value

    Scanner reader2 = new Scanner(System.in);

    System.out.println("Enter a number");
    int number3 = Integer.valueOf(reader2.nextLine());

    if(number3<0) {
      int absValue = number3*(-1);
      System.out.println("The absolute value of " + number3 + " is " + absValue);
    } else {
      System.out.println("The absolute value of " + number3 + " is " + number3);
    }
    //comparing numbers
    Scanner reader3 = new Scanner(System.in);

    System.out.println("Enter two numbers");
    int num1 = Integer.valueOf(reader3.nextLine());
    int num2 = Integer.valueOf(reader3.nextLine());

    if(num1>num2) {
      System.out.println(num1 + " is bigger than " + num2);
    } else if (num2>num1) {
      System.out.println(num2 + " is bigger than " + num1);
    } else {
      System.out.println(num1 + " equals " + num2 );
    }

  }
}
