package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@GetMapping("/getData")
	  ResponseEntity<Object> locationApi() {
		List<Map<String, Object>> studentData = jdbcTemplate.queryForList("select * from studentdetails");
		  return new ResponseEntity<Object>(studentData,HttpStatusCode.valueOf(200));
	  }
}
