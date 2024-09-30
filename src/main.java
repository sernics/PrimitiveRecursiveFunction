package src;

import src.Functions.PrimitiveRecursiveFunction;
import src.Functions.Proyection;
import src.Functions.Sucesor;
import src.Functions.Zero;

public class Main {
  public static void main(String[] args) {
    NaturalNumber n = new NaturalNumber(1);
    PrimitiveRecursiveFunction f = new Zero(n.getNumbers().size(), 1);
    n = f.operate(n);
    f = new Sucesor(1, 1);
    n.add(f.operate(n).getNumbers().get(0));
    f = new Proyection(n.getNumbers().size(), 1, 2);
    System.out.println(n);
    n = f.operate(n);
    System.out.println(n);
  }
}
