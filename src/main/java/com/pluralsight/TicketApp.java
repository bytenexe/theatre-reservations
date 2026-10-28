package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TicketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        //Prompt for user for their full name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        //Prompt for user for the date of the show
        System.out.println("What date will you be coming? (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        //Prompt the user for the number of tickets
        System.out.println("How many tickets would you like? ");
        int tickets = Integer.parseInt(scanner.nextLine());
    }
}
