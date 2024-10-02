package src;

import src.Functions.Combination;
import src.Functions.Composition;
import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Pow;

public class Main {
  public static void main(String[] args) {
    NaturalNumber n1 = new NaturalNumber(3);
    NaturalNumber n2 = new NaturalNumber(6);
    PrimitiveRecursiveFunction combination = new Combination(1, 2, n1);
    PrimitiveRecursiveFunction pow = new Pow();
    PrimitiveRecursiveFunction composition = new Composition(pow);
    System.out.println(composition.operate(combination.operate(n2)));
  }
}