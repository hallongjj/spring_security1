package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	   @GetMapping("/login/loginForm")
	   public String loginForm() {
	      log.info("Welcome Login Form");
	      return "login/loginForm2";
	   }
	   
	   @GetMapping("/user/userHome")
	   public void userHome() {
	      log.info("userHome");
	   }
	   
	   @GetMapping("/admin/adminHome")
	   public void adminHome() {
	      log.info("adminHome");
	   }
	   
	   @GetMapping("/login/accessDenied")
	   public void accessDenied() {
	      log.info("Access is Denied");
	   }
	
	
}
