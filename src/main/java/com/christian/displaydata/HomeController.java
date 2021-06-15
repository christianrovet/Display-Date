package com.christian.displaydata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {
	
	LocalDateTime date = LocalDateTime.now();
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(date));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH).format(date));
		return "time.jsp";
	}
}