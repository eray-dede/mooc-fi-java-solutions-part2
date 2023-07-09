package part2;
import java.util.Scanner;
public class methods {

  public static void main(String[] args) {
    //inAHoleInTheGround
    Scanner reader=new Scanner(System.in);
    System.out.println("Enter the number of times you want to print the sentence:");
    int repetition=Integer.valueOf(reader.nextLine());

    for(int i=0;i<repetition;i++) {
      printText();
    }
    //fromParameterToOne
    printFromNumberToOne(3);

    //division
    division(4,8);

    //divisibleByThree
    divisibleByThree(3,12);

    //numberUno
    int number= numberUno();
    System.out.println(number);

    //word
    String string = word();
    System.out.println(string);
    //summation
    int summation = sum(1,2,3,4);
    System.out.println(summation);
    //smallest
    int smallest =smallest(3,7);
    System.out.println(smallest);
    //greatest
    int greatest = greatest(5,3,1);
    System.out.println(greatest);
    //average
    double average = average(5,6,7,8);
    System.out.println(average);
    //printingStars
    printStars(5);
    //printingSquareStars
    printSquare(5);
    //printingRectangle
    printRectangle(17,3);
    //printingTriangle
    printTriangle(9);
    //printSpaces
    printSpaces(3);
    //rightLeaningTriangle
    rightLeaningTriangle(5);
  }

  public static void printText() {
    System.out.println("In A Hole In The Ground There Lived A Method");
  }

  public static void printFromNumberToOne(int number) {
    for(int i=number;i>0;i--) {
      System.out.println(i);
    }
  }
  public static void division(int numerator, int denominator) {
    System.out.println(numerator + "/" + denominator + "=" + (numerator*1.0/denominator));
  }
  public static void divisibleByThree(int beginning, int end) {
    for(int i=beginning;i<=end;i++) {
      if(i%3==0) {
        System.out.println(i);
      }
    }
  }
  public static int numberUno() {
    return 1;
  }
  public static String word() {
    return "string";
  }
  public static int sum(int number1, int number2, int number3, int number4) {
    return number1+number2+number3+number4;
  }
  public static int smallest(int numb1, int numb2) {
    if(numb1>numb2) {
      return numb2;
    } else {
      return numb1;
    }
  }
  public static int greatest(int num1, int num2, int num3) {
    if(num1<num2 && num1<num3) {
      return num1;
    } else if(num2<num1 && num2<num3) {
      return num2;
    } else {
      return num3;
    }
  }
  public static double average(int number1, int number2, int number3, int number4) {
    double avg = sum(number1,number2,number3,number4)/4.0;
    return avg;
  }
  public static void printStars(int number) {
    for(int i=0;i<number;i++) {
      System.out.print("*");
    }
  }
  public static void printSquare (int size) {
    System.out.println();
    for(int i=0;i<size;i++) {
      printStars(size);
      System.out.println();
    }
  }
  public static void printRectangle (int width, int height) {
    for(int i=0;i<height;i++) {
      printStars(width);
      System.out.println();
    }
  }
  public static void printTriangle (int size) {
    for(int i=0;i<size;i++) {
      printStars(i);
      System.out.println();
    }
  }
  public static void printSpaces(int size) {
    for(int i=0;i<size;i++) {
      System.out.println(" ");
    }
  }
  public static void rightLeaningTriangle(int height) {
    int j=height-1;
    for(int i=1;i<=height;i++){
      printSpaces(j);
      printStars(i);
      j--;
    }
  }
}
