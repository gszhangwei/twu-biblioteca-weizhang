package com.twu.biblioteca;

/**
 * Created by Arthur.w on 2016/6/6.
 */
public class Entity {
    private String name;
    private String artuor;
    private String publishedYear;
    private String year;
    private String director;
    private int movierating;
    private double price;
    private boolean available;


    public Entity() {
    }

    public Entity(String name, String artuor, String publishedYear , boolean available) {
        this.name = name;
        this.artuor = artuor;
        this.publishedYear = publishedYear;
        this.available = available;
    }

    public Entity(String name, String director, String year, int movierating, boolean available) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.movierating = movierating;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtuor() {
        return artuor;
    }

    public void setArtuor(String artuor) {
        this.artuor = artuor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublishers() {
        return publishedYear;
    }

    public void setPublishers(String publishers) {
        this.publishedYear = publishers;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBookInformation() {
        return "Book{" +
                "name='" + name + '\'' +
                ", artuor='" + artuor + '\'' +
                ", publishers='" + publishedYear  +
                '}';
    }

    public String getMovieInformation() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", movierating=" + movierating +
                '}';
    }
}
