package com.company;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача: доступ только совершеннолетним\n" +
                "если совершеннолетний - вывести \"добро пожаловать\"\n" +
                "иначе вывести \"доступ закрыт\"");
        LocalDate date = LocalDate.now();
        date = date.minusYears(18);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате: yy.yy.yyyy");
        String age = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        LocalDate birthday = LocalDate.parse(age, formatter);

        if (date.equals(birthday) || date.isAfter(birthday)) {
            System.out.println("Добро пожаловать");
        } else System.out.println("Доступ закрыт");
    }
}

