import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = scanner.nextLine();
    String b = scanner.nextLine();

    if (a.equals(b)) {
      System.out.println("Строки идентичны");
    } else {
      System.out.println("Строки неидентичны");
    }

    scanner.close();
  }
}
