package src.Functions;

import src.CounterClass;
import src.NaturalNumber;

public class Proyection extends PrimitiveRecursiveFunction  {
  private Number inputNumber;
  private Number outputNumber;
  private Number objetiveIndex;
  private NaturalNumber result;
  private CounterClass counter;

  public Proyection(Number inputNumber, Number outputNumber, Number objetiveIndex, CounterClass counter) {
    this.inputNumber = inputNumber;
    this.outputNumber = outputNumber;
    this.objetiveIndex = objetiveIndex.intValue();
    this.result = new NaturalNumber(-1);
    this.counter = counter;
  }
  public NaturalNumber operate(NaturalNumber n) {
    this.counter.incrementCounter();
    if (n.getNumbers().size() < this.objetiveIndex.intValue() || this.outputNumber.intValue() != 1) {
      throw new IllegalArgumentException("Proyection function only accepts 1 as output value and the input value must be less than the number of elements in the input list");
    }
    result = new NaturalNumber(n.getNumbers().get(objetiveIndex.intValue() - 1));
    return result;
  }
  public Number inputValues() {
    return inputNumber;
  }
  public Number outputValues() {
    return outputNumber;
  }
}
