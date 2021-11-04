package com.jasontech.drinks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service // bean for Drink controller
public class DrinkService {

    private DrinkDataAccessService drinkDataAccessService;

    @Autowired
    public DrinkService(DrinkDataAccessService drinkDataAccessService) {
        this.drinkDataAccessService = drinkDataAccessService;
    }

    public List<Drink> getDrinks() {
        return drinkDataAccessService.getAllDrinks();
    }

    public void insertNewDrink(Drink drink) {
        drinkDataAccessService.insertNewDrink(drink);
    }

    public void deleteDrink(int id) {
        drinkDataAccessService.deleteDrink(id);
    }

    public void updateDrink(int id, Drink drink) {
        drinkDataAccessService.updateDrink(id, drink);
    }
}
