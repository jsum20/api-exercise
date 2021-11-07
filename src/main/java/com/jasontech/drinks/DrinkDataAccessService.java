package com.jasontech.drinks;


import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.flywaydb.core.internal.jdbc.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgres")
public class DrinkDataAccessService implements DrinkDAO {

    private JdbcTemplate jdbcTemplate;

    public DrinkDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Drink> getAllDrinks() {
        String sql = """
                SELECT id, name , age
                FROM person
                """;
        List<Drink> drinks = jdbcTemplate.query(sql, new DrinkRowMapper());
        return drinks;
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public Optional<Drink> selectDrinkById(int id) {
//        return Optional.empty();
        throw new UnsupportedOperationException("not implemented");
    }


    @Override
    public int insertNewDrink(Drink drink) {

        String sql = """
              INSERT INTO drink(drinkname, sweetness, rating)
              VALUES(?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                drink.getName(),
                drink.getSweetnessLevel(),
                drink.getRating()
        );
    }

    @Override
    public int deleteDrink(int id) {
//        return 0;
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public int updateDrink(int id, Drink drink) {
//        return 0;
        throw new UnsupportedOperationException("not implemented");
    }
}
