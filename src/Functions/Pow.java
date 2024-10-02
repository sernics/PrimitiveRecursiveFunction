package src.Functions;

import src.NaturalNumber;

public class Pow extends PrimitiveRecursiveFunction {
  private NaturalNumber result;
  private Number inputValues;
  private Number outputValues;
  
  public Pow() {
    this.inputValues = 2;
    this.outputValues = 1;
    this.result = new NaturalNumber(-1);
  }
  public NaturalNumber operate(NaturalNumber n) {
    // The value that are going to be changing is the second value of the list, and when this value reach 0, 
    // the base case is going to be executed
    if (n.getNumbers().get(1).intValue() == 0) {
      PrimitiveRecursiveFunction zero = new Zero(1, 1);
      PrimitiveRecursiveFunction composition = new Composition(zero);
      PrimitiveRecursiveFunction proyection = new Proyection(2, 1, 1);
      PrimitiveRecursiveFunction sucesor = new Sucesor(1, 1);
      PrimitiveRecursiveFunction composition2 = new Composition(sucesor);
      this.result = composition2.operate(composition.operate(proyection.operate(n)));
      return this.result;
    } else {
      PrimitiveRecursiveFunction product = new Product();
      PrimitiveRecursiveFunction composition = new Composition(product);

      // (x, y, product(x, y)) -> parameters
      NaturalNumber parameters = new NaturalNumber(n.getNumbers().get(0).intValue());
      parameters.add(n.getNumbers().get(1).intValue() - 1);
      parameters.add(this.operate(parameters).getNumbers().get(0).intValue());

      PrimitiveRecursiveFunction proyection = new Proyection(3, 1, 1);
      PrimitiveRecursiveFunction proyection2 = new Proyection(3, 1, 3);

      PrimitiveRecursiveFunction combination = new Combination(1, 2, proyection.operate(parameters));
      NaturalNumber combinationResult = combination.operate(proyection2.operate(parameters));

      this.result = composition.operate(combinationResult);

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
