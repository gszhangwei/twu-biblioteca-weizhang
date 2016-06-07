package com.twu.biblioteca;

/**
 * Created by Arthur.w on 2016/6/6.
 */
public class Books {
    private String name;
    private String artuor;
    private String publishedYear;
    private double price;
    private boolean available;


    public Books() {
    }

    public Books(String name, String artuor, String publishedYear, float price ,boolean available) {
        this.name = name;
        this.artuor = artuor;
        this.publishedYear = publishedYear;
        this.price = price;
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
        return "Books{" +
                "name='" + name + '\'' +
                ", artuor='" + artuor + '\'' +
                ", publishers='" + publishedYear + '\'' +
                ", price=" + price + 
                '}';
    }
}
