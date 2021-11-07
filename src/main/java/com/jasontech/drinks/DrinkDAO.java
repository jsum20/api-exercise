package com.jasontech.drinks;

import java.util.List;
import java.util.Optional;

public interface DrinkDAO {
    List<Drink> getAllDrinks();
    Optional<Drink> selectDrinkById(int id);
    int insertNewDrink(Drink drink);
    int deleteDrink(int id);
    int updateDrink(int id, Drink drink);
}
