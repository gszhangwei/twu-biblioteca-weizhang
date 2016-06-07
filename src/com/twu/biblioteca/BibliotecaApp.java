package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int Option;

        Library library = new Library();
        AddEntity.addLibrary(library);
        System.out.println("------Welcome to Biblioteca!------");
        System.out.println("-----Main Menu-----");
        System.out.println("Select a valid option!");
        System.out.println("Option 1:List Books");
        System.out.println("Option 2:Checkout books");
        System.out.println("Option 3:Return books");
        System.out.println("Option 0:Quit");

        Option = scanner.nextInt();
        while (Option != -1) {
            mainmenuController(Option,library);
            if (scanner.hasNextInt()) {
                Option = scanner.nextInt();
            } else {
                Option = -1;
            }
        }
    }
        public static void mainmenuController(int Option, Library library){
            switch (Option) {
            case 1:
                library.showBookList();
                break;
            case 2:
                System.out.println("Please input a book Name to Checkout");
                scanner.nextLine();
                System.out.println(library.checkoutBookByName(scanner.nextLine()));
                break;
            case 3:
                System.out.println("Please input a book Name to Return");
                scanner.nextLine();
                System.out.println(library.returnBookByName(scanner.nextLine()));
                break;
            case 0:
                return;
        }
     }
}
