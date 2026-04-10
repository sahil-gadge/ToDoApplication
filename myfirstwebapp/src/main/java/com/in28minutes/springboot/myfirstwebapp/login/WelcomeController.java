package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

//	private Logger logger = LoggerFactory.getLogger(getClass());

	// /login => com.in28minutes.springboot.myfirstwebapp.login.LoginController =>
	// login.jsp

//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		logger.debug("Request Param is {} " + name);
//		logger.info("I want these to print at info level");
//		logger.warn("I want these to print at warn level");
//		System.out.println("Request Param is  " + name);
//		return "login";
//	}

//	private AuthenticationService authenticationService;
//
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

//	 login
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}

	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//
//		model.put("name", name);
////			model.put("password", password);
//
//		// Authentication
//		// name - in28minutes
//		// password - dummy
//
//		if (authenticationService.authenticate(name, password)) {
//
//			return "welcome";
//		}
//		model.put("errorMessage", "Invalid Credentials ! Please try again.");
//		return "login";
//	}

}
