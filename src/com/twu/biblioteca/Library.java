package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Arthur.w on 2016/6/6.
 */
public class Library {
    private ArrayList<Entity> BookList = new ArrayList<Entity>();
    private ArrayList<Entity> MovieList = new ArrayList<Entity>();
    private ArrayList<User> UserList = new ArrayList<User>();



    public Library(ArrayList<Entity> bookList) {
        BookList = bookList;
    }

    public Library() {
    }

    public ArrayList<User> getUserList() {
        return UserList;
    }

    public void setUserList(ArrayList<User> userList) {
        UserList = userList;
    }
    public void addEntity(String name, String artuor, String publishedYear , boolean available){
        BookList.add(new Entity(name,artuor,publishedYear,available));
    }

    public void addEntity(String name, String director, String year, int movierating, boolean available){
        MovieList.add(new Entity(name,director,year,movierating,available));
    }

    public void addUserAccount(String name, String email, String phonenumber, String librarynumber, String password){
        UserList.add(new User(name,email,phonenumber,librarynumber,password));
    }


    public void showEntityList(){
        if(BookList.size() !=0){
            for (Entity book:BookList
             ) {
            if(book.isAvailable()) {
                System.out.println(book.getBookInformation());
            }
         }
        }else {System.out.println("BookList is null!");}
        if(MovieList.size() != 0) {
            for (Entity movie : MovieList
                    ) {
                if (movie.isAvailable()) {
                    System.out.println(movie.getMovieInformation());
                }
            }
        }else {System.out.println("BookList is null!");}
    }

    public void showUserInformationInList(String librarynumber){
        for (User user:UserList
             ) {
            if (user.getLibrarynumber().equals(librarynumber)){
                System.out.println(user.showUserInformation());
            }
        }
    }

    public boolean Login(String librarynumber, String password){
        for (User user:UserList
             ) {
            if(user.getLibrarynumber().equals(librarynumber) && user.getPassword().equals(password)){
                return true;
            }else
                return false;
        }
        return false;
    }

//    public int findUser(String librarynumber){
//        for (User user:UserList
//             ) {
//            if(user.getLibrarynumber().equals(librarynumber)){
//                return UserList.indexOf(librarynumber);
//            }
//
//        }
//        return -1;
//    }



    public String checkoutBookByName(String name){
        if(BookList.size() !=0){
        for (Entity book:BookList
             ) {
            if(book.getName().equals(name) && book.isAvailable()){
                book.setAvailable(false);
                return "Thank you!Enjoy the book!";
            }else{
                return "That book is not available!";
            }
        }}
        return "-1";
    }

    public String returnBookByName(String name){
        for(Entity book:BookList){
            if(book.getName().equals(name) && !book.isAvailable()){
                book.setAvailable(true);
                return "Thank you for returning the book!";
            }else{
                return "That is not a valid book to return!";
            }
        }
        return "";
    }

    public String checkoutMovieByName(String name){
        if(MovieList.size() != 0){
            for (Entity movie: MovieList
                 ) {
                if(movie.getName().equals(name) && movie.isAvailable()){
                movie.setAvailable(false);
                return "Thank you!Enjoy the movie!";
            }else{
            return "That movie is not available!";}
            }}
        return "0";
    }

    public String returnMovieByName(String name){
        for (Entity movie: MovieList
             ) {
            if(movie.getName().equals(name) && !movie.isAvailable()){
                movie.setAvailable(true);
                return "Thank you for returning the movie!";
            }else {
                return "That is not a valid movie to return!";
            }
        }
        return "0";
    }


}
