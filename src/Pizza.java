//Задача 2* (не обязательно)
//    Дополните файлы Pizza.java и PizzaRunner.java из классной работы (и задачи № 1).
//
//    Добавьте классу Pizza приватный статический атрибут - максимально возможный вес пиццы.
//
//    Добавьте классу Pizza публичный статический метод (сеттер) для изменения этого атрибута.
//
//    При запуске программы PizzaRunner.java должна быть возможность:
//
//    запустить программу как раньше, без аргументов, тогда ограничения нет
//    (Или есть? подсказка: Integer.MAX_VALUE).
//    запустить программу с одним аргументом командной строки: целым числом.
//    Тогда именно это целое число и будет максимально возможным весом пиццы (в граммах).

//    Примечание
//    Вы также можете проверить параметр командно строки на корректность
//    и использовать IncorrectWeightException из задачи 1 в случае некорректного запуска программы.

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
