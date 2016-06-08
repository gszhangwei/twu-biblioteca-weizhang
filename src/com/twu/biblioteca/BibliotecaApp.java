package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    static Scanner scanner = new Scanner(System.in);
    static String librarynumber;
    static String password;
    static int Usernumber;
        public static void main(String[] args) {

        int Option;

        Library library = new Library();
        AddEntity.addLibrary(library);
        System.out.println("------Welcome to Biblioteca!------");
        System.out.println("Please input librarynumber and password to Login");
        System.out.println();
        System.out.print("Please input librarynumber:");
        librarynumber = scanner.nextLine();
        System.out.println();
        System.out.print("Please input password:");
        password = scanner.nextLine();
        System.out.println();
        if(library.Login(librarynumber,password)){
            System.out.println("-----Main Menu-----");
            System.out.println("Select a valid option!");
            System.out.println("Option 1:List Books");
            System.out.println("Option 2:Checkout Books");
            System.out.println("Option 3:Return Books");
            System.out.println("Option 4:Checkout Movies");
            System.out.println("Option 5:Return Movies");
            System.out.println("Option 6:Get UserInformation");
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
         }else{
            System.out.println("Wrong librarynumber or password!");}
    }
        public static void mainmenuController(int Option, Library library){
            switch (Option) {
            case 1:
                library.showEntityList();
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
            case 4:
                System.out.println("Please input a movie Name to Checkout");
                scanner.nextLine();
                System.out.println(library.checkoutMovieByName(scanner.nextLine()));
                break;
            case 5:
                System.out.println("Please input a movie Name to Return");
                scanner.nextInt();
                System.out.println(library.returnMovieByName(scanner.nextLine()));
                break;
            case 6:
                library.showUserInformationInList(librarynumber);
                break;
            case 0:
                System.out.println("Goodbye");
                System.exit(0);
                break;
        }
     }
}
