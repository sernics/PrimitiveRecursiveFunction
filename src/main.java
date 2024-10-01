package src;

import src.Functions.Combination;
import src.Functions.Composition;
import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Product;

public class Main {
  public static void main(String[] args) {
    NaturalNumber n1 = new NaturalNumber(9);
    NaturalNumber n2 = new NaturalNumber(30);
    PrimitiveRecursiveFunction combination = new Combination(1, 2, n1);
    PrimitiveRecursiveFunction product = new Product();
    PrimitiveRecursiveFunction composition = new Composition(product);
    System.out.println(composition.operate(combination.operate(n2)));
  }
}