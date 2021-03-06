package com.jasontech.drinks;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fake")
public class FakeDataAccessService implements DrinkDAO {

    private List<Drink> db = new ArrayList<>();

    public FakeDataAccessService() {
        db.add(new Drink(1,"mojito", 6, 8));
        db.add(new Drink(2,"pina colada", 9, 8));
    }

    public List<Drink> getAllDrinks() {
        return db;
    }


    public Optional<Drink> selectDrinkById(int id) {
        return db.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    public int insertNewDrink(Drink drink) {
        db.add(drink);
        return 1;
    }

    public void setDb(List<Drink> db) {
        this.db = db;
    }

    public int deleteDrink(int id) {
        Optional<Drink> drink = getAllDrinks()
                .stream()
                .filter(d -> d.getId() == id)
                .findFirst();

        drink.ifPresent(d -> db.remove(d));
        return 1;
    }

    public int updateDrink(int id, Drink drink) {
        Optional<Drink> drinkUpdate = getAllDrinks()
                .stream()
                .filter(d -> d.getId() == id)
                .findFirst();
        drinkUpdate.ifPresent(d -> db.remove(d));
        drinkUpdate.ifPresent(d -> db.add(drink));
        return 1;
    }


}
