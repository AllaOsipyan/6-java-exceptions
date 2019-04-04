package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(14));

    }

    static String getSeason(int monthNumber) {
        if(monthNumber == 12||monthNumber>0&&monthNumber<=2)
            return "зима";
        else if(monthNumber>=3&&monthNumber<=5)
            return "весна";
        else if(monthNumber >=6 && monthNumber<=8)
            return "лето";
        else if(monthNumber>=9&&monthNumber<=12)
            return "осень";
        else  throw new IllegalArgumentException("monthNumber "+ monthNumber+" is invalid, month number should be between 1..12");



    }
}