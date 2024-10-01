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
    // The value that are going to be changing is the second value of the list, and when this value reach 0, 
    // the base case is going to be executed
    if (n.getNumbers().get(1).intValue() == 0) {
      return new NaturalNumber(n.getNumbers().get(0));
    } else {
      PrimitiveRecursiveFunction sucesor = new Sucesor(1, 1);
      PrimitiveRecursiveFunction proyection = new Proyection(3, 1, 3);

      NaturalNumber parameters = new NaturalNumber(n.getNumbers().get(0).intValue());
      parameters.add(n.getNumbers().get(1).intValue() - 1);

      NaturalNumber value = this.operate(parameters);

      parameters.add(value.getNumbers().get(0).intValue());

      NaturalNumber valueToSuccess = proyection.operate(parameters);
      this.result = sucesor.operate(valueToSuccess);

      return this.result;
    }
  }
  public Number inputValues() {
    return inputValues;
  }
  public Number outputValues() {
    return outputValues;
  }
}
