package src;

import src.Functions.Combination;
import src.Functions.Composition;
import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Pow;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CounterClass counter = new CounterClass();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    NaturalNumber n1 = new NaturalNumber(scanner.nextInt());
    System.out.print("Ingrese el segundo número: ");
    NaturalNumber n2 = new NaturalNumber(scanner.nextInt());
    scanner.close();
    PrimitiveRecursiveFunction combination = new Combination(1, 2, n1);
    PrimitiveRecursiveFunction pow = new Pow(counter);
    PrimitiveRecursiveFunction composition = new Composition(pow);
    System.out.println(composition.operate(combination.operate(n2)));
    System.out.println("Número de llamadas recursivas a funciones: " + counter.getCounter());
  }
}