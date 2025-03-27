package com.mycompany.Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {

    public static ArrayList<Matchs> list = new ArrayList();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        fillList(list);
        System.out.println("""
                           \u001b[46m** Welcome to Streaming Service **
                           What would you like to do ?""");

        int choice = 0;

        Subscription subscription = null;
        Client client = null;//
        do {
            menu();
            try {

                choice = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice!");
                read.nextLine();
            }

            switch (choice) {
                case 1: //Show Matchs Type
                    System.out.println("**All Matchs Type**");
                    for (Matchs e : list) {
                        System.out.println(e);
                        System.out.println("----------------------------");

                    }

                    break;

                case 2: //Show Commentator
                    Commentator cm = new Commentator(3500, "Arabic", 4443339, "Fares Awadh");

                    System.out.println("Commentator Info: ");
                    System.out.println(cm);
                    break;

                case 3: //Add new commentator
                    try {
                    System.out.println("Enter commentator ID :");
                    int id = read.nextInt();
                    read.nextLine();
                    System.out.println("Enter commentator name :");
                    String name = read.nextLine();
                    System.out.println("Enter commentator language :");
                    String lang = read.nextLine();
                    System.out.println("Enter commentator popularity :");
                    System.out.print("%");
                    int pop = read.nextInt();
                    Commentator c = new Commentator(pop, lang, id, name);
                    System.out.println(c);
                    System.out.println("New commentator has been added successfully!");

                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice!");
                    read.nextLine();
                }

                break;

                case 4: //New Account
                    try {
                    System.out.print("Enter your id: ");
                    int clientId = read.nextInt();
                    read.nextLine();
                    System.out.print("Enter your name: ");
                    String clientName = read.nextLine();
                    System.out.print("Enter your phone: ");
                    int clientPhone = read.nextInt();
                    System.out.print("Enter your password: ");
                    String clientPassword = read.next();

                    client = new Client(clientPhone, clientPassword, clientId, clientName);
                    System.out.println(client);//toString
                    System.out.println("Your account has been created successfully!\n");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice!");
                    read.nextLine();
                }

                break;

                case 5: //New Subscription
                    if (client == null) {
                        System.out.println("Please create an account first!");
                        break;
                    }
                    try {
                        System.out.println("Enter Subscription Date");
                        System.out.print("Year: ");
                        int year = read.nextInt();
                        System.out.print("Month: ");
                        int month = read.nextInt();
                        System.out.print("Day: ");
                        int day = read.nextInt();

                        System.out.print("Enter Subscription Plan Months: ");
                        int months = read.nextInt();
                        System.out.println("* Payment *");
                        read.nextLine();
                        System.out.print("Enter card holder name: ");
                        String paymentName = read.nextLine();
                        System.out.print("Enter payment type(Visa, ApplePay etc..): ");
                        String paymentType = read.nextLine();

                        System.out.print("Confirm Subscription? (Y/N): ");
                        char answer = read.next().charAt(0);
                        if (answer == 'y' || answer == 'Y') {

                            Date date = new Date(day, month, year);
                            Payment payment = new Payment(paymentName, paymentType);
                            subscription = new Subscription(date, client, payment, months);
                            subscription.setStatus("Active");
                            subscription.print();
                            System.out.println("* Your Subscription has been confirmed! *\n");
                        } else {
                            System.out.println("Your Subscription has been cancelled!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid choice!");
                        read.nextLine();
                    }

                    break;

                case 6: //Show Subscriotion

                    if (subscription == null) {
                        System.out.println("You don't have any subscription yet!");
                    } else {
                        subscription.print();
                    }
                    break;

                case 7://Cancel Subscription
                    if (subscription != null) {
                        System.out.print("Are you sure you want to cancel your Subscription? (Y/N): \n");
                        char answer = read.next().charAt(0);
                        if (answer == 'y' || answer == 'Y') {
                            subscription.setStatus("Cancelled");
                            subscription.print();
                            System.out.println("Your Subscription has been cancelled!\n");
                        } else {
                            System.out.println("Your Subscription is still Active!\n");
                        }
                    } else {
                        System.out.println("No subscriptions yet!");
                    }
                    break;

                case 8://Exit
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }//end switch

        } while (choice != 8);

    }

    public static void menu() {
        System.out.print("1. Show Matchs Types");
        System.out.print("\n2. Show Original Commentator");
        System.out.print("\n3. Add new commentator");
        System.out.print("\n4. New Account");
        System.out.print("\n5. New Subscription");
        System.out.print("\n6. Show Subscription");
        System.out.print("\n7. Cancel Subscription");
        System.out.print("\n8. Exit\n");
        System.out.print("-->");

    }

    public static void fillList(ArrayList<Matchs> list) {

        //ArrayList<Commentator> cm = new ArrayList<>();
        //public Football(String referee, String club, int weight, int MatchDuration, String City, String Stadium, int ExtraTime,int Halves,int NumberOfPlayer,Commentator [] Commentator) {
        //public Basketball(String mostFamousPlayer,int minutesPerGame, int MatchDuration, String City, String Stadium, Commentator[] Commentator, int ExtraTime, int Halves, int NumberOfPlayer) {
        Football f = new Football("Jang", "Alhilal", 30, 90, "Riyadh", "King Fahad", 30, 2, 11, null);
        Basketball b = new Basketball("Bill Russell", 12, 48, "Riyadh", "ii", null, 5, 3, 5);
        list.add(f);
        list.add(b);
    }
}