package src;

import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Zero;

public class Main {
  public static void main(String[] args) {
    NaturalNumber n = new NaturalNumber(1);
    PrimitiveRecursiveFunction f = new Zero(1, 1);
    n = f.operate(n);
    System.out.println(n);
  }
}
