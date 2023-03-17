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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PizzaRunner {


  public static int parseArguments(String[] args) {
    int someWeight = Integer.MAX_VALUE;

    for (String argument : args) {
      someWeight = Integer.parseInt(argument);
      if (someWeight < 0) {
        throw new IncorrectWeightException(someWeight);
      }
    }
    return someWeight;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    parseArguments(args);

    System.out.print("Введите количество пицц: ");
    int n = Integer.parseInt(br.readLine());
    Set<Pizza> pizzas = new HashSet<>();
    for (int i = 0; i < n; ++i) {
      System.out.println("Ввод данных для пиццы номер " + (i + 1) + ":");
      System.out.print("  Введите название: ");
      String title = br.readLine();
      System.out.print("  Введите вес в граммах (целое число): ");
      int weight = Integer.parseInt(br.readLine());

      Pizza tempPizza = new Pizza(title, weight, parseArguments(args));
      pizzas.add(tempPizza);
    }

    System.out.println("У нас есть данные про " + pizzas.size() + " уникальных пицц:");
    int k = 1;
    for (Pizza p : pizzas) {
      System.out.println(k + ". " + p);
      ++k;
    }
  }
}
