package org.example;

import Klasy.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Adam", "Kowalski");
        System.out.println(osoba.getInfo());
        Osoba osoba2 = new Osoba("Amelia", "Nowak");
        System.out.println(osoba2.getInfo());
    }
}