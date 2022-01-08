package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fullName;
        String birthDate;
        String email;

        System.out.print("Please input your full name: ");
        Scanner sc = new Scanner(System.in);

        fullName = sc.nextLine();
        System.out.println("Hello, " + fullName + ".\nPlease input your birth year(dd-MM-yyyy): ");

        birthDate = sc.nextLine();
        System.out.println("Your birth date is: " + birthDate + ".\nDear " + fullName + ", input your email(ex:email@something.com): ");

        email = sc.nextLine();
        System.out.println("Your email: " + email);

        splitDate(birthDate);
        splitDate(birthDate,"/");

        //afisare data curenta
        //schimbare format data
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDate = dateTime.format(formatter);
        System.out.println(currentDate);

    }
    public static ArrayList<Integer> splitDate(String date){
        ArrayList<Integer> dates = new ArrayList<>();

        //cea mai simpla forma de lista, vector[]
        //Integer.parseInt = transforma un string in int
        String[] temp = date.split("-");
        int day = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int year = Integer.parseInt(temp[2]);
        System.out.println("day: " + day + "\n" +
                "month: " + month + "\n" +
                "year: " + year + "\n");
        dates.add(day);
        dates.add(month);
        dates.add(year);
        return dates;
    }

    public static ArrayList<Integer> splitDate(String date,String delimiter){
        ArrayList<Integer> dates = new ArrayList<>();

        //cea mai simpla forma de lista, vector[]
        //Integer.parseInt = transforma un string in int
        String[] temp = date.split(delimiter);
        int day = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int year = Integer.parseInt(temp[2]);
        System.out.println("day: " + day + "\n" +
                "month: " + month + "\n" +
                "year: " + year + "\n");
        dates.add(day);
        dates.add(month);
        dates.add(year);
        return dates;
    }
}
