//package com.jasontech.drinks;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//public class DrinkRowMapper implements RowMapper<Drink> {
//
//    @Override
//    public Drink mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Drink drink = new Drink(
//                rs.getInt("id"),
//                rs.getString("name"),
//                rs.getInt("age"),
//                List.of());
//        return drink;
//    }
//}
