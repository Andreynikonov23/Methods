package nick.pack;


public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth();
        System.out.println("Номер планеты от солнца: " + earth.NUMBER);
        System.out.println("Диаметр: " + earth.DIAMETER);
        System.out.println("Плотность: " + earth.DENSITY);
        System.out.println("Средняя темпиратура: " + earth.TEMPERATURE);
        System.out.println("Спутник: " + earth.SATELLITE);
    }
}
