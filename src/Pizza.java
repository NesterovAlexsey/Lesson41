public class Pizza {

  private String title;
  private int weight;

  //    Добавьте классу Pizza приватный статический атрибут
  //    - максимально возможный вес пиццы.
  public static int maxWeight = Integer.MAX_VALUE;

  public Pizza(String title, int weight, int maxWeight) {

    if (weight < 0) {
      throw new IncorrectWeightException(weight);
    }

    this.title = title;
    this.weight = weight;
    this.maxWeight = maxWeight;
  }

  public Pizza(String title, int weight) {
    if (weight < 0) {
      throw new IncorrectWeightException(weight);
    }

    this.title = title;
    this.weight = weight;
  }

  public static int getMaxWeight() {
    return maxWeight;
  }

  //    Добавьте классу Pizza публичный статический метод (сеттер) для изменения этого атрибута.
  public static void setMaxWeight(int maxWeight) {
    Pizza.maxWeight = maxWeight;
  }

  @Override
  public String toString() {
    return "Пицца '" + title + "' весом " + weight + " г; Max Weight = " + maxWeight;
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
