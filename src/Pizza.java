//    Дополните файл Pizza.java из классной работы,
//    выбросив в конструкторе исключение IncorrectWeightException
//    при попытке создать пиццу с отрицательной массой.

public class Pizza {

  private String title;
  private int weight;

  public Pizza(String title, int weight) {
    if (weight < 0) {
      throw new IncorrectWeightException(weight);
    }

    this.title = title;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Пицца '" + title + "' весом " + weight + " г";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Pizza otherPizza)) {
      return false;
    }
    return title.equals(otherPizza.title) && weight == otherPizza.weight;
  }

  @Override
  public int hashCode() {
    return 31 * weight * title.hashCode();
  }
}
