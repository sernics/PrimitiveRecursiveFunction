package src;

import src.Functions.Combination;
import src.Functions.Composition;
import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Suma;

public class Main {
  public static void main(String[] args) {
    NaturalNumber n1 = new NaturalNumber(90);
    NaturalNumber n2 = new NaturalNumber(7);
    PrimitiveRecursiveFunction suma = new Suma();
    PrimitiveRecursiveFunction composition = new Composition(suma);
    PrimitiveRecursiveFunction combination = new Combination(1, 2, n1);
    System.out.println(composition.operate(combination.operate(n2)));
  }
}