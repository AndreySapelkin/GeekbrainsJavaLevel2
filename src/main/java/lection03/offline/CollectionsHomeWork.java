package lection03.offline;

import java.util.*;

public class CollectionsHomeWork {

    public static void main(String[] args) {

        List<String> words = new ArrayList(Arrays.asList(
                "Слово 1",
                "Слово 2",
                "Слово 3",
                "Слово 4",
                "Слово 5",
                "Слово 6",
                "Слово 7",
                "Слово 8",
                "Слово 9",
                " ",
                "Слово 2",
                "Слово 2",
                "Слово 3",
                "",
                "Слово 4",
                "Слово 4",
                "Слово 5",
                "Слово 6"
        ));

        System.out.println("1.1 Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).");

        Collection<String> tmpWords = new TreeSet<>(words);

        ArrayList<String> uniqueWords = new ArrayList<>(tmpWords);

        for (String e : uniqueWords) {
            if (e.equals(" ") || e.isEmpty()) {
                System.out.println("Пустое слово");
            } else {
                System.out.println(e);
            }
        }

        System.out.println("1.2 Подсчитать сколько раз встречается каждое слово.");

        Map<String, Integer> numberOfIdenticalWords = new HashMap<>();
        for (String e : words) {
            numberOfIdenticalWords.merge(e, 1, Integer::sum);
        }

        Set<Map.Entry<String, Integer>> entriesOld = numberOfIdenticalWords.entrySet();
        for (Map.Entry<String, Integer> pair : entriesOld) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Слово - " + key + " встречается - " + value + " раз/а");
        }

        System.out.println("2.1 Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий" +
                " и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. " +
                "С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией " +
                "может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны " +
                "выводиться все телефоны.");

        Phonebook phonebook = new Phonebook();

        phonebook.addPhones("Ivanov", "11111");
        phonebook.addPhones("Ivanov", "22222");
        phonebook.addPhones("Ivanov2", "44444");
        phonebook.addPhones("Ivanov2", "55555");
        phonebook.addPhones("Ivanov3", "66666");
        phonebook.addPhones("Ivanov3", "77777");

        System.out.println("Телефоны Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("Телефоны Ivanov2: " + phonebook.get("Ivanov2"));
        System.out.println("Телефоны Ivanov3: " + phonebook.get("Ivanov3"));
    }

}
