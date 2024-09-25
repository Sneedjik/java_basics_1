package javaBasics;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Целочисленные типы
        byte aByte = 0;   // 8bit   -128 +127                       (-2^8) .. (+2^8 -1)
        short aShort = 0; // 16bit  -32768 +32767                   (-2^16) .. (+2^16 -1)
        int aInt = 0;     // 32bit  -4.294.967.296 +4.294.967.295   (-2^32) .. (+2^32 -1)
        Integer intWrapper = 0; // Обёртка
        long aLong = 0;   // 64bit  ещё больше                      (-2^64) .. (+2^64 -1)

        // Типы с плавающей точкой
        float aFloat = 0.0F;  //  32bit
        double aDouble = 0.0; //  64bit

        // Символьный тип
        char aChar = 'a'; // хранит код символа , в данном случае 'a'
        Character charWrapper = 'a'; // Обёртка

        // Логический тип
        boolean aBoolean = true; // Истина или Ложь

        // Объектные или ссылочные типы данных
        String toBePrint = "Hello world!"; // Строка

        List<String> teachers = List.of("I", "Y", "K"); // Список


        // Класс - набор маленьких кусочков данных, собранных в одну структуру с понятным названием.
        class Cup {
            String color = "white";
            int volume = 250;
            boolean hasHandle = true;
        }

        // Операторы

        // Оператор присвоения =
        String name = "Y";

        // Арифметические операторы + - / * % ++ --
        System.out.println(4.0 / 3); // Деление в java отбрасывает остаток, если выражение с целыми числами (Если double, то не отбросился бы)

        // Операторы сравнения <, >, >=, <=, !=, ==
        System.out.println(3 != 2);

        // Логические операторы &, |, &&(и), ||(или), !(инверсия результата (если не равно))

        // Оператор instanceof - является ли эта переменная типом таким-то, в примере это String
        System.out.println(toBePrint instanceof String);

        // Тернарный оператор - позволяет что-то проверить, прежде чем сделать.

        char sex = 'm';

        String childName = sex == 'm'
                ? "S"
                : "Y";

        // Управляющая конструкция if
        if (sex == 'm') {
            childName = "S";
        } else {
            childName = "Y";
        }

        // key word или ключевое слово new
        String name = new String("I");
        String name = "Y";

    }
}