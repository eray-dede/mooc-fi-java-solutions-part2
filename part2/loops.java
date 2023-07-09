package part2;

import java.util.Scanner;

public class loops {

  public static void main(String[] args) {
    //carryOn
    Scanner reader = new Scanner(System.in);

    while(true) {
      System.out.println("Shall we carry on?");
      String input = reader.nextLine();
      if(input.equals("y")) {
        break;
      }
    }
    //areWeThereYet
    Scanner reader1 = new Scanner(System.in);

    while (true) {
      System.out.println("Give a number");
      int number = Integer.valueOf(reader1.nextLine());
      if(number==4) {
        break;
      }
    }
    //onlyPositives
    Scanner reader2 = new Scanner(System.in);

    while(true) {
      System.out.println("Give a number:");
      int num = Integer.valueOf(reader2.nextLine());
      if (num < 0) {
        System.out.println("Unsuitable number");
      } else if (num == 0) {
        break;
      } else {
        System.out.println(num * num);
        break;
      }
    }
      //numbersOfNegativeNumbers
      Scanner reader3 = new Scanner(System.in);
      int counter = 0;

      while(true) {
        System.out.println("Enter a number");
        int num1 = Integer.valueOf(reader3.nextLine());

       if(num1<0) {
         counter++;
       } else if (num1 == 0) {
         break;
       }
      }
      System.out.println("The number of negative numbers: " + counter);

      //sumOfNumbers
    Scanner reader4 = new Scanner(System.in);

    int sumOfNumbers = 0;

    while(true) {
      System.out.println("Enter a number:");
      int numbers= Integer.valueOf(reader4.nextLine());

      if(numbers == 0) {
        break;
      } else {
        sumOfNumbers = sumOfNumbers + numbers;
      }
    }
    System.out.println("The sum equals:" + sumOfNumbers);

    // numbersAndSumOfNumbers

    Scanner reader5 = new Scanner(System.in);

    int sumOfAllNumbers = 0;
    int numberOfAllNumbers = 0;

    while(true) {
      System.out.println("Enter a integer:");
      int num3 = Integer.valueOf(reader5.nextLine());

      if(num3==0) {
        break;
      } else if (num3<0) {
        numberOfAllNumbers++;
        sumOfAllNumbers =+ num3;
      } else {
        numberOfAllNumbers++;
        sumOfAllNumbers =+ num3;
      }
    }
    System.out.println("The number of numbers: " + numberOfAllNumbers);
    System.out.println("The sum of numbers: " + sumOfAllNumbers);
  }
}
