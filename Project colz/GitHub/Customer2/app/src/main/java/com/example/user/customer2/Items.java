package com.example.user.customer2;

/**
 * Created by user on 2/24/2017.
 */

public class Items {
    int Image;
    String Name;
    String Price;

    public Items(int Image, String Name, String Price) {
        this.Image = Image;
        this.Name = Name;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        this.Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }
}

