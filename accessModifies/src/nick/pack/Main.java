package nick.pack;


public class Main {
    public static void main(String[] args) {
        /*
        Перед тобой программа, которая выводит информацию о человеке в консоли.
        К сожалению, она не компилируется.
        Измени минимальное необходимое количество модификаторов доступа в классе Person,
        чтобы код скомпилировался.
         */
        Person person = new Person();
        person.setPerson("Андрей", "Никонов");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println(person.getFullName());
    }
}