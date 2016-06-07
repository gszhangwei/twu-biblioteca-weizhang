package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Arthur.w on 2016/6/6.
 */
public class Library {
    private ArrayList<Books> BookList = new ArrayList<Books>();

    public Library(ArrayList<Books> bookList) {
        BookList = bookList;
    }

    public Library() {
    }

    public void addBook(String name, String artuor, String publishedYear, float price ,boolean available){
        BookList.add(new Books(name,artuor,publishedYear,price,available));
    }


    public void showBookList(){
        for (Books book:BookList
             ) {
            if(book.isAvailable()) {
                System.out.println(book.getBookInformation());
            }
        }
    }


    public String checkoutBookByName(String name){
        for (Books book:BookList
             ) {
            if(book.getName().equals(name) && book.isAvailable()){
                book.setAvailable(false);
                return "Thank you!Enjoy the book!";
            }else{
                return "That book is not available!";
            }
        }
        return "";
    }

    public String returnBookByName(String name){
        for(Books book:BookList){
            if(book.getName().equals(name) && !book.isAvailable()){
                book.setAvailable(true);
                return "Thank you for returning the book!";
            }else{
                return "That is not a valid book to return!";
            }
        }
        return "";
    }

}
