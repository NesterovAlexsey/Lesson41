public class IncorrectWeightException extends IllegalArgumentException {

  public IncorrectWeightException(int num) {
    super("Вес не может быть отрицательным: [" + num + "]");
  }
}

