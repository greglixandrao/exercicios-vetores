package application;

import entities.Rent;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rent[] room = new Rent[10];

        System.out.println("How many rooms will be rent?");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next();
            System.out.print("Room: ");
            int roomNumber = scan.nextInt();
            room[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }
    }
}
