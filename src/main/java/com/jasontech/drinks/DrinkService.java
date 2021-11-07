package com.jasontech.drinks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bean for Drink controller
public class DrinkService {

    private DrinkDAO drinkDAO;

    @Autowired
    public DrinkService(@Qualifier("postgres") DrinkDAO drinkDAO) {
        this.drinkDAO = drinkDAO;
    }

    public List<Drink> getDrinks() {
        return drinkDAO.getAllDrinks();
    }

    public void insertNewDrink(Drink drink) {
        drinkDAO.insertNewDrink(drink);
    }

    public void deleteDrink(int id) {
        drinkDAO.deleteDrink(id);
    }

    public void updateDrink(int id, Drink drink) {
        drinkDAO.updateDrink(id, drink);
    }
}
