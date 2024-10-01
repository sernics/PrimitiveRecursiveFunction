package src.Functions;

import src.NaturalNumber;

public class Suma implements PrimitiveRecursiveFunction {
  private NaturalNumber result;
  private Number inputValues;
  private Number outputValues;
  
  public Suma() {
    this.inputValues = 2;
    this.outputValues = 1;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    result = new NaturalNumber(n.getNumbers().get(0).intValue() + n.getNumbers().get(1).intValue());
    return result;
  }
  public Number inputValues() {
    return inputValues;
  }
  public Number outputValues() {
    return outputValues;
  }
}
