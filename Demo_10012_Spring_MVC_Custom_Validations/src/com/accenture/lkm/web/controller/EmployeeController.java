package com.accenture.lkm.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.EmployeeBean;

@Controller
public class EmployeeController {
	
	

	//for Date conversion either write @DateTimeFormat(pattern="dd-MMM-yyyy")
	//or uncomment the below code
	//InitBinder is used bind the validators or formatters to Spring Context
	//so that it can be used during the data binding
	//i.e. when data submitted by view is bound to the Spring Model and is fed
	//to BackEndController
	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init Binder invoked for date formatting");
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	    binder.registerCustomEditor(Date.class, "joiningDate", new CustomDateEditor(dateFormat, true));
	} */
	
	// Default method is Get
	@RequestMapping("/loadEmployeeRegistrationPage")
	public ModelAndView showRegistrationPage() {
		return new ModelAndView("Registration", "employeeBean",
				new EmployeeBean());
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView register(
			@ModelAttribute("employeeBean") @Valid EmployeeBean employeeBean,
			BindingResult result) {

		ModelAndView modelAndView = new ModelAndView();

		String pageName = "";
		if (result.hasErrors()) {
			pageName = "Registration";
		} else {
			pageName = "RegistrationSuccess";
			modelAndView.addObject("message","Welcome: " + employeeBean.getName());
		}
		modelAndView.setViewName(pageName);

		return modelAndView;
	}
}