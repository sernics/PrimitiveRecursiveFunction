package src.Functions;
import src.NaturalNumber;

public interface PrimitiveRecursiveFunction {
  public NaturalNumber operate(NaturalNumber n);
  public default NaturalNumber zero() {
    return new NaturalNumber(0);
  }
  public default NaturalNumber successor(NaturalNumber n) {
    return new NaturalNumber(n.getNumbers().get(0).intValue() + 1);
  }
}
