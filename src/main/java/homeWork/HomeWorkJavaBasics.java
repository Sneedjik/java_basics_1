package homeWork;

public class HomeWorkJavaBasics {

    public static void main(String[] args) {
        byte aByte = 127;
        byte overflowByte = (byte) (aByte + 1); // Переполнение
        System.out.println(overflowByte); // Из-за переполнения выводит только младшие 8 бит результата
    }

}