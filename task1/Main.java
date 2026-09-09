import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = 0;
    int b = 0;

    if (!scanner.hasNextInt()) {
      System.out.println("Ошибка. Введите целое число");
      return;
    }
    a = scanner.nextInt();
    if (!scanner.hasNextInt()) {
      System.out.println("Ошибка. Введите целое число");
      return;
    }
    b = scanner.nextInt();
    if (a > b) {
      System.out.println("a > b");
    } else if (a == b) {
      System.out.println("a = b");
    } else {
      System.out.println("a < b");
    }

    System.out.println("Сложение " + (a + b));
    System.out.println("Вычитание " + (a - b));
    System.out.println("Деление " + ((float) a / (float) b));
    System.out.println("Умножение " + (a * b));

    scanner.close();
  }
}
