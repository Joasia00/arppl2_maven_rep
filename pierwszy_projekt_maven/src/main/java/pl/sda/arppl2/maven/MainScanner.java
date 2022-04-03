package pl.sda.arppl2.maven;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie:");

        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();

        System.out.println("Cześć" + slowo + ", jesteś najlepszą programistką przy tej klawiaturze!");

        System.out.println("Podaj swój wiek:");

        int liczba = scanner.nextInt();
        liczba = liczba / 10;
        System.out.println("Czy wiesz, że żyjesz już" + " dekad");
    }
}
