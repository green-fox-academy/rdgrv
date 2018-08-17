public class Counter {
  int fieldValue;
  int resetValue;

  public Counter() {
    fieldValue = 0;
    resetValue = fieldValue;
  }

  public Counter(int fieldValue) {
    this.fieldValue =fieldValue;
    resetValue = fieldValue;
  }

  public int add(int number) {
    fieldValue += number;
    return fieldValue;
  }

  public int add() {
    return fieldValue++;
  }

  public int get() {
    System.out.println(fieldValue);
    return fieldValue;
  }

  public int reset() {
    return this.fieldValue = resetValue;
  }
}