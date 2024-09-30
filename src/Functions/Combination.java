package src.Functions;

import src.NaturalNumber;
import java.util.ArrayList;

public class Combination implements PrimitiveRecursiveFunction {
  private Number inputNumber;
  private Number outputNumber;
  private NaturalNumber first;
  private NaturalNumber result;

  public Combination(Number inputNumber, Number outputNumber, NaturalNumber first) {
    this.inputNumber = inputNumber;
    this.outputNumber = outputNumber;
    this.first = first;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber second) {
    if (second.getNumbers().size() != 1) {
      throw new IllegalArgumentException("The composition just work with one value in the second operand");
    }
    if (outputNumber.intValue() != first.getNumbers().size() + second.getNumbers().size()) {
      throw new IllegalArgumentException("The output size doesnt fit");
    }
    ArrayList<Number> result = first.getNumbers();
    result.add(second.getNumbers().get(0));
    this.result = new NaturalNumber(result);
    return this.result;
  }
  public Number inputValues() {
    return inputNumber;
  }
  public Number outputValues() {
    return outputNumber;
  }
}
