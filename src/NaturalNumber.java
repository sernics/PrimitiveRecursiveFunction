package src;

import java.util.ArrayList;

public class NaturalNumber {
  private ArrayList<Number> numbers;
  
  public NaturalNumber() {
    numbers = new ArrayList<Number>();
  }
  public NaturalNumber(Number n) {
    numbers = new ArrayList<Number>();
    numbers.add(n);
  }
  public NaturalNumber(ArrayList<Number> numbers) {
    this.numbers = new ArrayList<Number>(numbers);
  }
  public void add(Number n) {
    numbers.add(n);
  }
  public void remove(Number n) {
    numbers.remove(n);
  }
  public ArrayList<Number> getNumbers() {
    return numbers;
  }
  public NaturalNumber copy() {
    return new NaturalNumber(numbers);
  }
  @Override
  public String toString() {
    return "NaturalNumber{" +
            "numbers=" + numbers +
            '}';
  }
}
