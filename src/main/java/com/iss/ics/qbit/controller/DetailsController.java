package com.iss.ics.qbit.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iss.ics.qbit.db.Database;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Configuration
public class DetailsController {

	@Autowired
	Database db;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/getDetails")
	List getData() {
		return db.getall();
	}

	@RequestMapping("/date")
	public String getDateTime(){
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		return ft.format(date);
	}
}