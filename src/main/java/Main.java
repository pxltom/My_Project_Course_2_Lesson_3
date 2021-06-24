import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    //    Практическое задание
//    Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать, сколько раз встречается каждое слово.
//    Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
//    Консоль использовать только для вывода результатов проверки телефонного справочника.
    public static void main (String[] args) {

        findAndCountUniqWords("Cat", "Animal", "Bird", "Horse", "Elephant", "Human", "Mouse", "Bird", "Horse", "Elephant",
                "Human", "Bird", "Bird", "Horse", "Human", "Human", "Animal", "Bird", "Elephant", "Horse");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Пушкин", "+79299596105");
        phoneBook.add("Иванов", "+79199579105");
        phoneBook.add("Гагарин", "+79299579105");
        phoneBook.add("Сергеев", "+79299379105");
        phoneBook.add("Сергеев", "+79299371105");
        phoneBook.add("Тютчев", "+79299579105");
        phoneBook.add("Маяковский", "+79299579105");

        phoneBook.getAllFio().forEach(e -> System.out.println("[" + e + "] - "
                + phoneBook.getPhoneNumbersByFio(e)));

    }

    public static void findAndCountUniqWords (String... arr) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : arr) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }


}


