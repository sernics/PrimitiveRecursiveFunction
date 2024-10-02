package src.Functions;
import src.NaturalNumber;

public abstract class PrimitiveRecursiveFunction {
  public abstract NaturalNumber operate(NaturalNumber n);
  // N^inputValues() -> N^outputValues()
  public abstract Number inputValues();
  public abstract Number outputValues();
}