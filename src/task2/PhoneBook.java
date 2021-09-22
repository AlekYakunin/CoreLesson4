package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<Contact>> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    // добавление контакта
    public void add(Contact value) {
        String key = value.getLastName();               // используем в качестве ключа lastName

        if (!phoneNumbers.containsKey(key)) {           // если не было записи с таким ключом
            phoneNumbers.put(key, new ArrayList<>());   // создадим
        }
        phoneNumbers.get(key).add(value);               // иначе в эту же запись добавим контакт
    }

    // поиск контактов
    public String findContacts(String key) {
        StringBuilder string = new StringBuilder(); // Используем StringBuilder, т.к. строку будем собирать из частей
        ArrayList<Contact> contacts = phoneNumbers.get(key); // получим набор контактов для этого ключа

        if (contacts != null) {
            for (Contact contact : contacts) {
                // выведем набор контактов для этого ключа из ArrayList
                string.append("  имя: ").append(contact.getFirstName())
                        .append(", номер: ").append(contact.getPhoneNumber())
                        .append("\n");
            }
        } else {
            string.append("контакты не найдены!");
        }
        return string.toString();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (Map.Entry<String, ArrayList<Contact>> entry : phoneNumbers.entrySet()) {
            // выведем "ключ"
            String key = entry.getKey();
            string.append(key).append("\n");
            string.append(findContacts(key));
        }
        return string.toString();
    }

    public HashMap<String, ArrayList<Contact>> getPhoneNumbers() {
        return phoneNumbers;
    }

}
