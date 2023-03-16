//    Создайте своё собственное исключение IncorrectWeightException
//    и унаследуйте его от IllegalArgumentException.
//
//    Добавьте ему конструктор, в который можно передавать одно целое число.
//
//    При этом супер-класс IllegalArgumentException должен создаваться с сообщением об ошибке
//    вида "Вес не может быть отрицательным: [некоректный вес]"

public class Exception extends IllegalArgumentException {
  int num;

  public Exception(int num) {
    super("Вес не может быть отрицательным: [" + num + "]");
  }

}

