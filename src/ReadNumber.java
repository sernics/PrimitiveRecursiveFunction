package src;

import java.util.Scanner;

public class ReadNumber {
  public NaturalNumber read(Scanner scanner) {
    int input1 = scanner.nextInt();
    while (input1 < 0) {
        System.out.print("Por favor, ingrese un número natural (0 o mayor): ");
        input1 = scanner.nextInt();
    }
    return new NaturalNumber(input1);
  }
}
