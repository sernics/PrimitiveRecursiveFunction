package src.Functions;

import src.CounterClass;
import src.NaturalNumber;

public class Zero extends PrimitiveRecursiveFunction {
  private Number inputNumber;
  private Number outputNumber;
  private NaturalNumber result;
  private CounterClass counter;

  public Zero(Number inputNumber, Number outputNumber, CounterClass counter) {
    this.inputNumber = inputNumber;
    this.outputNumber = outputNumber;
    this.result = new NaturalNumber(-1);
    this.counter = counter;
  }
  public NaturalNumber operate(NaturalNumber n) {
    if (this.inputNumber.intValue() != 1 || this.outputNumber.intValue() != 1) {
      throw new IllegalArgumentException("Zero function only accepts 1 as input and output values");
    }
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
