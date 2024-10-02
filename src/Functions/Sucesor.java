package src.Functions;

import src.NaturalNumber;

public class Sucesor extends PrimitiveRecursiveFunction {
  private Number inputNumber;
  private Number outputNumber;
  private NaturalNumber result;

  public Sucesor(Number inputNumber, Number outputNumber) {
    this.inputNumber = inputNumber;
    this.outputNumber = outputNumber;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    if (this.inputNumber.intValue() != 1 || this.outputNumber.intValue() != 1) {
      throw new IllegalArgumentException("Sucesor function only accepts 1 as input and output values");
    }
    result = new NaturalNumber(n.getNumbers().get(0).intValue() + 1);
    return result;
  }
  public Number inputValues() {
    return inputNumber;
  }
  public Number outputValues() {
    return outputNumber;
  }
}
