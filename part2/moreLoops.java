package part2;
import java.util.Scanner;

public class moreLoops {

  public static void main(String[] args) {
    //counting
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int countingNumber = Integer.valueOf(reader.nextLine());

    for(int i=0;i<=countingNumber;i++) {
      System.out.println(i);
    }
    //countingToHundred
    Scanner reader1 = new Scanner(System.in);

    System.out.println("Enter a number:");
    int countingToHundred = Integer.valueOf(reader1.nextLine());

    for(int i=countingToHundred;i<=100;i++) {
      System.out.println(i);
    }
    //whereTo
    Scanner reader2 = new Scanner(System.in);

    System.out.println("Enter the number that you want to go:");
    int whereTo = Integer.valueOf(reader2.nextLine());

    for(int i=1;i<=whereTo;i++) {
      System.out.println(i);
    }
    //whereFrom
    Scanner reader3 = new Scanner(System.in);

    System.out.println("Enter the number that you want to start from:");
    int whereFrom = Integer.valueOf(reader3.nextLine());
    System.out.println("Enter the number that you want to go:");
    int whereTo2 = Integer.valueOf(reader3.nextLine());

    for(int i=whereFrom;i<=whereTo2;i++) {
      System.out.println(i);
    }
    //sumOfSequence 1+2+3+..+n = ?
    Scanner reader4 = new Scanner(System.in);

    int sumOfSequence = 0;

    System.out.println("Last number?");
    int lastNum = Integer.valueOf(reader4.nextLine());

    for(int i=1;i<=lastNum;i++) {
      sumOfSequence = sumOfSequence + i;
    }
    System.out.println("The sum is: " + sumOfSequence);

    //factorial   1*2*3*4*...*n = ?
    Scanner reader5 = new Scanner(System.in);

    int mult = 1;

    System.out.println("Last number for factorial?");
    int lastNumber = Integer.valueOf(reader5.nextLine());

    for(int i=1;i<=lastNumber;i++) {
      mult=mult*i;
    }
    System.out.println("The factorial equals:" + mult);
    //part1,2,3: reading,sum,numbers of numbers
    Scanner reader6=new Scanner(System.in);

    int evenNumbers=0;
    int oddNumbers=0;
    int sumOfNums=0;
    int numbersOfNumbers=0;
    System.out.println("Enter a number:");

    while(true) {
      int inputNum = Integer.valueOf(reader6.nextLine());

      if(inputNum==-1) {
        break;
      }
      sumOfNums = sumOfNums + inputNum;
      numbersOfNumbers++;

      if(inputNum%2==0) {
        evenNumbers++;
      } else {
        oddNumbers++;
      }
    }
    System.out.println("Thanks, bye!");
    System.out.println(sumOfNums);
    System.out.println(numbersOfNumbers);
    System.out.println(evenNumbers);
    System.out.println(oddNumbers);

  }
}
