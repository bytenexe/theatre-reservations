package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.parse;

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

        // Processing the user inputs
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("How many tickets would you like: ");
        String ticketInput = scanner.nextLine().trim();
        int numTickets = Integer.parseInt(ticketInput);

        String resTicket;
        if (numTickets > 1) {
            resTicket = "tickets";
        } else {
            resTicket = "ticket";
        }

        // Output the number of tickets and full name
        LocalDate ticketDate = parse(date, formatter);
        System.out.println("# " + numTickets + " " + resTicket + " reserved for " + ticketDate + " under " + lastName + " " + firstName);
    }
}
