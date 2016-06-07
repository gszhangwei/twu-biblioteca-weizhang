package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arthur.w on 2016/6/7.
 */
public class LibraryTest {
    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        library.addBook("TW0", "arthur0", "20100203", 70, true);
        library.addBook("TW1", "arthur1", "20110205", 80, true);
        library.addBook("TW2", "arthur2", "20120206", 450, true);
    }


    @Test
    public void should_check_out_book_by_name_IS_right() throws Exception {
        assertEquals("Thank you!Enjoy the book!",library.checkoutBookByName("TW0"));
    }

    @Test
    public void should_check_out_book_by_name_NOT_right() throws Exception {
        assertEquals("That book is not available!",library.checkoutBookByName("TW23"));
    }

    @Test
    public void should_the_book_return_IS_right() throws Exception {
        library.checkoutBookByName("TW0");
        assertEquals("Thank you for returning the book!",library.returnBookByName("TW0"));
    }

    @Test
    public void should_the_book_return_NOT_right() throws Exception {
        library.checkoutBookByName("TW0");
        assertEquals("That is not a valid book to return!",library.returnBookByName("TW1"));
    }
}