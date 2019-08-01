package com.ao.springjdbc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class ProviderController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/provider")
    public Map Show_List(){
        List<Map<String, Object>> lists = jdbcTemplate.queryForList("select * from provider");
        Map<String, Object> result = lists.get(0);


        return  result;     //return json
    }

}
