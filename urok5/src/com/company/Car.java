package com.company;

// название класса должно совпадать с именем файла!
// Класс - это шаблон для создания объекта

public class Car {
    String color;// переменная внутри класса - свойство
    int maxSpeed;

    public void drive () {
        System.out.println("Car is driving");
    }
    public void stop () {
        System.out.println("Car was stopped");
    }

}
