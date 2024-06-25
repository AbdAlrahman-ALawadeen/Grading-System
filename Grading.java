import java.util.Scanner;
public class Grading{
  public static void main(String[] args) {
    System.out.println("Grading System Initialized");
    Scanner scanner = new Scanner(System.in);
    double grade = scanner.nextDouble();
    System.out.println(FinalGrade(grade));
    System.out.println(FinalCode(grade));
  }
  public static float FinalGrade(double grade){
    return (float) ((grade * 4.2) / 100); 
  }
  public static String FinalCode(double grade){
    return grade < 50 ? 'F' : grade < 60 ? (grade < 54 ? "D-" : grade < 57 ? "D" : "D+") : grade < 70 ? (grade < 64 ? "C-" : grade < 67 ? "C" : "C+") : grade < 80 ? (grade < 74 ? "B-" : grade < 77 ? "B" : "B+") : (grade < 64 ? "A-" : grade < 95 ? "A" : "A+");
  }
}