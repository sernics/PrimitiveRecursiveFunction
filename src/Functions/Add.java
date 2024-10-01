package src.Functions;

import src.NaturalNumber;

public class Add implements PrimitiveRecursiveFunction {
  private NaturalNumber result;
  private Number inputValues;
  private Number outputValues;
  
  public Add() {
    this.inputValues = 2;
    this.outputValues = 1;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    // The value that are going to be changing is the second value of the list, and when this value reach 0, 
    // the base case is going to be executed
    if (n.getNumbers().get(1).intValue() == 0) {
      PrimitiveRecursiveFunction proyection = new Proyection(2, 1, 1);
      return proyection.operate(n);
    } else {
      PrimitiveRecursiveFunction sucesor = new Sucesor(1, 1);
      PrimitiveRecursiveFunction proyection = new Proyection(3, 1, 3);
      
      // (x, y, add(x, y)) -> parameters
      NaturalNumber parameters = new NaturalNumber(n.getNumbers().get(0).intValue());
      parameters.add(n.getNumbers().get(1).intValue() - 1);
      parameters.add(this.operate(parameters).getNumbers().get(0).intValue());
      
      PrimitiveRecursiveFunction composition = new Composition(sucesor);
      this.result = composition.operate(proyection.operate(parameters));

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
