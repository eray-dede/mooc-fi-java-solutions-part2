package part2;

public class advancedAstrology {

  public static void main(String[] args) {
    printChristmasTree(6);
  }
  public static void printStars (int number) {
    for(int i=0;i<number;i++) {
      System.out.print("*");
    }
  }
  public static void printSpaces(int number) {
    for(int i=0;i<number;i++) {
      System.out.print(" ");
    }
  }
  public static void printRightLeaningTriangle(int size) {
    int j=size-1;
    for (int i=1;i<=size;i++) {
      printSpaces(j);
      printStars(i);
      System.out.println();
      j--;
    }
  }
  public static void printChristmasTree(int height) {
    int base=2*height-1;
    int triangleStarSpace=(base/2);
    for(int i=1;i<=height;i++) {
      printSpaces(triangleStarSpace);
      printStars(2*i-1);
      System.out.println();
      triangleStarSpace--;
    }
    for(int i=1;i<=2;i++) {
      printSpaces((base/2)-1);
      printStars(3);
      System.out.println();
    }
  }
}
