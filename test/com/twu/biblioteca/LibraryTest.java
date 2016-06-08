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
        library.addEntity("TW0", "arthur0", "20100203",  true);
        library.addEntity("TW1", "arthur1", "20110205",  true);
        library.addEntity("TW2", "arthur2", "20120206",  true);
        library.addEntity("movie0","arthur5","20160621",5,true);
        library.addUserAccount("zhangsan","12586624@qq.com","13415896225","111-3333","1234567");
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

    @Test
    public void should_the_movie_check_out_by_name_IS_right() throws Exception{
        assertEquals("Thank you!Enjoy the movie!",library.checkoutMovieByName("movie0"));
    }

    @Test
    public void should_the_movie_check_out_by_name_NOT_right() throws Exception{
        assertEquals("That movie is not available!",library.checkoutMovieByName("123456"));
    }

    @Test
    public void should_the_MOVIE_return_IS_right() throws Exception {
        library.checkoutMovieByName("movie0");
        assertEquals("Thank you for returning the movie!",library.returnMovieByName("movie0"));
    }

    @Test
    public void should_the_MOVIE_return_NOT_right() throws Exception {
        library.checkoutMovieByName("movie0");
        assertEquals("That is not a valid movie to return!",library.returnMovieByName("movie123"));
    }

    @Test
    public void should_the_user_Login_Successful_by_right_password_and_right_librarynumber() throws Exception{
        assertEquals(true,library.Login("111-3333","1234567"));
    }

    @Test
    public void should_the_user_Login_Unsuccessful_by_right_password_and_wrong_librarynumber() throws Exception{
        assertEquals(false,library.Login("111-2222","1234567"));
    }

    @Test
    public void should_the_user_Login_Unsuccessful_by_wrong_password_and_right_librarynumber() throws Exception{
        assertEquals(false,library.Login("111-3333","1112222"));
    }

    @Test
    public void should_the_user_Login_Unsuccessful_by_wrong_password_and_wrong_librarynumber() throws Exception{
        assertEquals(false,library.Login("111-2333","2222222"));
    }


}