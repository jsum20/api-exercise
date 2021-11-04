package com.jasontech.drinks;

import java.util.Objects;

public class Drink {
    private int id;
    private String name;
    private int sweetnessLevel;
    private int rating;
    // list of ingredients


    public Drink(int id, String name, int sweetnessLevel, int rating) {
        this.id = id;
        this.name = name;
        this.sweetnessLevel = sweetnessLevel;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sweetnessLevel=" + sweetnessLevel +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id && sweetnessLevel == drink.sweetnessLevel && rating == drink.rating && Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sweetnessLevel, rating);
    }
}
