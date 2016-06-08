package com.twu.biblioteca;

/**
 * Created by Arthur.w on 2016/6/7.
 */
public class AddEntity {
    public static void addLibrary(Library library){
        library.addEntity("TW0", "arthur0", "20100203", true);
        library.addEntity("TW1", "arthur1", "20110205", true);
        library.addEntity("TW2", "arthur2", "20120206", true);
        library.addEntity("TW3", "arthur3", "20130208", true);
        library.addEntity("TW4", "arthur4", "20160207", true);

        library.addEntity("movie0","arthur5","20160621",5,true);
        library.addEntity("movie1","arthur6","20160622",6,true);
        library.addEntity("movie2","arthur7","20160623",7,true);
        library.addEntity("movie3","arthur8","20160624",1,true);

        library.addUserAccount("zhangsan","123456454@gmail.com", "13419549682", "1234567","1111111");
    }
}