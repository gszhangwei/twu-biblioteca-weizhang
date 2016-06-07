package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Arthur.w on 2016/6/7.
 */
public class AddEntity {
    public static void addLibrary(Library library){
        library.addBook("TW0", "arthur0", "20100203", 70, true);
        library.addBook("TW1", "arthur1", "20110205", 80, true);
        library.addBook("TW2", "arthur2", "20120206", 450, true);
        library.addBook("TW3", "arthur3", "20130208", 705, true);
        library.addBook("TW4", "arthur4", "2060207", 123, true);
    }
}