package task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // массив для животных
        List<String> animals = new ArrayList<String>();
        // добавим животных в массив
        animals.addAll(Arrays.asList("кошки", "собаки", "мышки", "кошки", "собаки", "волки", "медведи", "кошки", "лоси", "зайцы", "мышки"));

        // HashMap для подсчета количества повторяющихся животных
        Map<String, Integer> population = new HashMap<String, Integer>();

        // цикл по массив животных
        for (String str : animals) {
            if (population.containsKey(str)) {                  // если есть животное с таким ключом
                population.put(str, population.get(str) + 1);   // запишем в него увеличенное на 1 значение
            } else {                                            // если нет такого ключа,
                population.put(str, 1);                         // запишем его со значением = 1
            }
        }

        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            // выведем пару "ключ - значение"
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
