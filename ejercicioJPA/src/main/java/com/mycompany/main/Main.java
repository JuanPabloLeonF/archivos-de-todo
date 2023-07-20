package com.mycompany.main;

import com.mycompany.model.Player;
import com.mycompany.controlador.PlayerController;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlayerController playerController = new PlayerController();
        Scanner menuOption = new Scanner(System.in);
        int userOption;

        do {
            System.out.print("################### MENU ###############\n" +
                    "1. Create a new player\n" +
                    "2. Search player information\n" +
                    "3. Search players by gender\n" +
                    "4. Search players within a height range\n" +
                    "5. Search players within an age range\n" +
                    "6. Show the entire list of players\n" +
                    "7. Modify a player\n" +
                    "8. Delete a player\n" +
                    "9. Exit the program\n" +
                    "########################################\n" +
                    "Enter an option from the menu: "
            );
            userOption = menuOption.nextInt();

            switch(userOption) {

                case 1: {

                    Scanner scannerIdentification = new Scanner(System.in);
                    System.out.print("Enter your identification: ");
                    String identification = scannerIdentification.nextLine();

                    Scanner scannerAge = new Scanner(System.in);
                    System.out.print("Enter your age: ");
                    int age = scannerAge.nextInt();

                    Scanner scannerHeight = new Scanner(System.in);
                    System.out.print("Enter your height: ");
                    double height = scannerHeight.nextDouble();

                    Scanner scannerName = new Scanner(System.in);
                    System.out.print("Enter your name: ");
                    String name = scannerName.nextLine();

                    Scanner scannerGender = new Scanner(System.in);
                    System.out.print("Enter your gender: ");
                    String gender = scannerGender.nextLine();

                    Player player = new Player(identification, age, height, name, gender);
                    playerController.create(player);
                    break;
                }
                case 2: {

                    Scanner scannerName = new Scanner(System.in);
                    System.out.print("Enter the name of the player you want to search: ");
                    String name = scannerName.nextLine();
                    List<Player> searchResult = playerController.searchPlayerByName(name);
                    for (Player player : searchResult) {
                        System.out.println(player);
                    }
                    System.out.println("");
                    break;
                }
                case 3: {

                    Scanner scannerGender = new Scanner(System.in);
                    System.out.print("Enter the gender of the players you want to search: ");
                    String gender = scannerGender.nextLine();
                    List<Player> searchResult = playerController.searchPlayerByGender(gender);
                    for (Player player : searchResult) {
                        System.out.println(player);
                    }
                    System.out.println("");
                    break;
                }
                case 4: {

                    Scanner scannerMinHeight = new Scanner(System.in);
                    System.out.print("Enter the start height: ");
                    double minHeight = scannerMinHeight.nextDouble();

                    Scanner scannerMaxHeight = new Scanner(System.in);
                    System.out.print("Enter the end height: ");
                    double maxHeight = scannerMaxHeight.nextDouble();

                    List<Player> searchResult = playerController.searchPlayerByHeightRange(minHeight, maxHeight);
                    for (Player player : searchResult) {
                        System.out.println(player);
                    }
                    System.out.println("");
                    break;
                }
                case 5: {

                    Scanner scannerMinAge = new Scanner(System.in);
                    System.out.print("Enter the start age: ");
                    int minAge = scannerMinAge.nextInt();

                    Scanner scannerMaxAge = new Scanner(System.in);
                    System.out.print("Enter the end age: ");
                    int maxAge = scannerMaxAge.nextInt();

                    List<Player> searchResult = playerController.searchPlayerByAgeRange(minAge, maxAge);
                    for (Player player : searchResult) {
                        System.out.println(player);
                    }
                    System.out.println("");
                    break;
                }
                case 6: {

                    List<Player> searchResult = playerController.getAllPlayers();
                    for (Player player : searchResult) {
                        System.out.println(player);
                    }
                    System.out.println("");
                    break;
                }
                case 7: {

                    Scanner scannerId = new Scanner(System.in);
                    System.out.print("Enter the ID of the player you want to modify: ");
                    int id = scannerId.nextInt();

                    Scanner scannerIdentification = new Scanner(System.in);
                    System.out.print("Enter your identification: ");
                    String identification = scannerIdentification.nextLine();

                    Scanner scannerAge = new Scanner(System.in);
                    System.out.print("Enter the new age: ");
                    int age = scannerAge.nextInt();

                    Scanner scannerHeight = new Scanner(System.in);
                    System.out.print("Enter the new height: ");
                    double height = scannerHeight.nextDouble();

                    Scanner scannerName = new Scanner(System.in);
                    System.out.print("Enter the new name: ");
                    String name = scannerName.nextLine();

                    Scanner scannerGender = new Scanner(System.in);
                    System.out.print("Enter the new gender: ");
                    String gender = scannerGender.nextLine();

                    Player player = new Player(id,identification, age, height, name, gender);
                    playerController.update(player);
                    break;
                }
                case 8: {

                    Scanner scannerId = new Scanner(System.in);
                    System.out.print("Enter the ID of the player you want to delete: ");
                    int id = scannerId.nextInt();

                    playerController.delete(id);
                    break;
                }
                case 9: {
                    System.out.println("Closing program... Thank you for choosing us");
                    break;
                }
                default: {
                    System.out.println("Sorry, unspecified menu option. Please try again.");
                }
            }

        } while(userOption != 9);
    }
}