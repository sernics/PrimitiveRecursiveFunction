package src.Functions;
import src.NaturalNumber;

public interface PrimitiveRecursiveFunction {
  public NaturalNumber operate(NaturalNumber n);
  // N^inputValues() -> N^outputValues()
  public Number inputValues();
  public Number outputValues();
}
