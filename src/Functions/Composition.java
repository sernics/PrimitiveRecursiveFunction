package src.Functions;

import src.NaturalNumber;

public class Composition implements PrimitiveRecursiveFunction {
  private PrimitiveRecursiveFunction function;
  private NaturalNumber result;

  public Composition(PrimitiveRecursiveFunction function) {
    this.function = function;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    result = function.operate(n);
    return result;
  }
  public Number inputValues() {
    return function.inputValues();
  }
  public Number outputValues() {
    return function.outputValues();
  }
}
