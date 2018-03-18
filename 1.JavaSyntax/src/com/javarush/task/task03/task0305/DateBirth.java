package com.javarush.task.task03.task0305;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBirth {

    private int month;
    private int day;
    private int year;

    DateBirth(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;

        // проверяю дату на корректность по сравнению с текущей датой
        Date dateNow = new Date();
        SimpleDateFormat monthNow = new SimpleDateFormat("MM");
        SimpleDateFormat dayNow = new SimpleDateFormat("dd");
        SimpleDateFormat yearNow = new SimpleDateFormat("yyyy");

        int curMonth = Integer.parseInt(monthNow.format(dateNow));
        int curDay = Integer.parseInt(dayNow.format(dateNow));
        int curYear = Integer.parseInt(yearNow.format(dateNow));

        // если год больше теущего
        if (year > curYear) {
            System.out.println("Your year of birth can't be in future");
        } else if (year == curYear) {
            // если месяц больше текущего
            if (month > curMonth) {
                System.out.println("Your month of birth can't be in future");
            } else if (month == curMonth) {
                // если день болье текущего
                if (day > curDay) {
                    System.out.println("Your month of birth can't be in future");
                }
            }
        }
    }

    private String getMonth() {
        // перевожу числовое значение месяца в строку

        String monthToString = "";
        switch (month) {
            case 1: monthToString = "JANUARY";
                    break;
            case 2: monthToString = "FEBRUARY";
                    break;
            case 3: monthToString = "MARCH";
                    break;
            case 4: monthToString = "APRIL";
                    break;
            case 5: monthToString = "MAY";
                    break;
            case 6: monthToString = "JUNE";
                    break;
            case 7: monthToString = "JULY";
                    break;
            case 8: monthToString = "AUGUST";
                    break;
            case 9: monthToString = "SEPTEMBER";
                    break;
            case 10: monthToString = "OCTOBER";
                    break;
            case 11: monthToString = "NOVEMBER";
                    break;
            case 12: monthToString = "DECEMBER";
                    break;
            default:
                System.out.println("Please enter MONTH in format: 1, available value: 1 - 12 ");
        }
        return monthToString;
    }

    private boolean isLeap() {
        //проверяю високосный год или нет
        return ( ( year % 400 == 0 ) || ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) );
    }

    private int getDay() {
        // проверяю что введенное значение для месяца соответствует формату
        if (day == 0) {
            System.out.println("Day can't be " + day);
        }
        // проверка введенного значения для февраля
        if (month == 2) {
            if (isLeap()) {
                if (day > 29) {
                    System.out.println("In " + year + " FEBRUARY include 29 days");
                } else {
                    if (day > 28) {
                        System.out.println("In " + year + " FEBRUARY include 28 days");
                    }
                }
            }
        }
        // проверка количества дней в месяце
        // в месяце 30 дней
        int [] smallMonth = {4, 6, 9, 11};

        for (int i = 0; i < smallMonth.length; i++) {
            if (month == smallMonth[i]) {
                if (day > 30) {
                    System.out.println("In " + month + " month only 30 days");
                } else {
                    if (day > 31) {
                        System.out.println("In " + month + " month only 31 days");
                    }
                }
            }
        }
        return day;
    }

    public void correctDate(){

    }

    private int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getMonth()
                + " "
                + getDay()
                + " "
                + getYear();
    }
}
