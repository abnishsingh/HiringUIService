package com.iss.ics.qbit.db;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@Configuration
public class Database {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/****************************** Application Features **************************************/
	public List getall(){
		return jdbcTemplate.queryForList("SELECT * FROM [Moonshot].[dbo].[savedExecutions]");
	}
}