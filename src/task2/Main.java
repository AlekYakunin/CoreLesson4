package task2;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        // Заполгим Телефонный справочник
        phoneBook.add(new Contact("920-123-11-45", "Иванов", "Иван"));
        phoneBook.add(new Contact("920-654-12-56", "Иванов", "Иван"));
        phoneBook.add(new Contact("930-987-65-21", "Петров", "Петр"));
        phoneBook.add(new Contact("902-999-88-77", "Петров", "Петр"));
        phoneBook.add(new Contact("950-951-88-11", "Сидоров","Степан"));
        phoneBook.add(new Contact("950-951-88-11", "Сидоров","Федор"));

        System.out.println("Телефонный справочник");
        System.out.println(phoneBook);

        System.out.println("Контакты по ключу 'Сидоров':");
        System.out.println(phoneBook.findContacts("Сидоров"));

        System.out.println("Контакты по ключу 'Соколов':");
        System.out.println(phoneBook.findContacts("Соколов"));
    }
}
