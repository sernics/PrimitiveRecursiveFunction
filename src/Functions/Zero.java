package src.Functions;

import src.NaturalNumber;

public class Zero implements PrimitiveRecursiveFunction {
  private Number inputNumber;
  private Number outputNumber;
  private NaturalNumber result;

  public Zero(Number inputNumber, Number outputNumber) {
    this.inputNumber = inputNumber;
    this.outputNumber = outputNumber;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    result = new NaturalNumber(0);
    return result;
  }
  public Number inputValues() {
    return inputNumber;
  }
  public Number outputValues() {
    return outputNumber;
  }
}
