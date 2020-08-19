package com.example.aop;

import com.example.raai.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomerService {
    private final JdbcTemplate jdbcTemplate;

    public CustomerService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Collection<Customer> findAll(){
        //1
        RowMapper<Customer> rowMapper = (rs, rowNum) -> new Customer(rs.getLong("ID"),
                rs.getString("EMAIL"));
        //2
        return this.jdbcTemplate.query("select * from customers",rowMapper);


    }
}
