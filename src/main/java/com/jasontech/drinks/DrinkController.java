package com.jasontech.drinks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/drinks")
public class DrinkController {

    private DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping
    public List<Drink> getDrinks() {
        return drinkService.getDrinks();
    }

    @PostMapping
    public void insertNewDrink(@RequestBody Drink drink) {
        drinkService.insertNewDrink(drink);
    }

    @DeleteMapping("{id}")
    public void deleteDrink(@PathVariable("id") int id) {
        drinkService.deleteDrink(id);
    }

    @PutMapping("{id}")
    public void updateDrink(@PathVariable("id") int id, @RequestBody Drink drink) {
        drinkService.updateDrink(id, drink);
    }
}
