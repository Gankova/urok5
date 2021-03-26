package com.company;

public class Main {
    // Main запускает программу без нее Java не работает - класс
    // main m =new main

    public static void main(String[] args) {// вызывает метод
	sum (1.5f, 4.5f,5.5f);
	//ctrl+курсором на функцию показывает, где она вызывается
        System.out.println(sum(1, 5, 8, 9));
        System.out.println(fact(12));
        System.out.println(fact2(5));
        System.out.println(sumDigits(1234));

        // создание объекта
        Car bmv = new Car ();
        bmv.color = "red";
        bmv.maxSpeed = 240;
        bmv.drive(); // вызываем метод конкретную данную машину ЕХАТЬ
        bmv.stop();

        Car audi = new Car ();
        audi.color = " black";
        audi.maxSpeed = 145;
        audi.drive();
    }
    // число int n [0,1000000]; 2^n =? (вывести на экран !!!!) Stryng
    // ПЕРЕГРУЗКА метода sum
    // для создания новой перезагрузки - необходимо либо изменить кол-во параметров либо один из типов любого параметра


    // ООП - объектно -ориентированное програмирование
    // Принципы ООП :
    // 1 Инкапсуляция - способность создавать объекты
    // 2 Полиморфизм
    // 3 Наследование
    // 4 Абстракция

    // Объект в Java - сущность. которая содержит набор свойств (атрибутов) и может выполнять заданный набор действий
    // Пример: объект car
    // свойства : color, name , view, ......
    // действия : drive? stpo? break,.....
    // Для создания объкта (-ов) необходиом описать класс (class)





    public static int sum (int a, int b){
        return  a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    public static float sum (float a, float b, float c) {
        return a + b + c;
    }
    public static float sum (int ...arr) {
        int s= 0;
        for (int e : arr){
            s += e;
        }
        return s;
    }
    // Расчет факториалов. 5! = 1*2*3*4*5 = 120
    // 1-ая итерация =1 2) итерация f =5*4=20 (n на второй итерации 5-4); и т.д (0 для n=5)
    public static int fact (int n) {
        int f = 1;
        for (; n > 1; n--) {
            f *= n;
        }
        return f;
    }
    // Рекурсия (вызов метода в самом себе
    //
    public static int fact2 (int n) {

        if (n == 1) {
            return 1;
        }
        return n * fact2(n-1);
    }
    //1234 % 10 = 4
    // 1234 / 10 = 123
    //123 % 10 = 3
    //
    public static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return ( n % 10) + sumDigits(n/10);
        // n =12234/10    4+3+2+1+0
    }




}
