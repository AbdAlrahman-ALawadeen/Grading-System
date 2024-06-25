import java.util.Scanner;
public class Grading{
  public static void main(String[] args) {
    System.out.println("Grading System Initialized");
    Scanner scanner = new Scanner(System.in);
    double grade = scanner.nextDouble();
    System.out.println(FinalGrade(grade));
  }
  public static float FinalGrade(double grade){
    return (float) ((grade * 4.2) / 100); 
  }
}