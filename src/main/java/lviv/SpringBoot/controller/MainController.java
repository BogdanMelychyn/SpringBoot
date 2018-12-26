package lviv.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lviv.SpringBoot.model.Customer;
import lviv.SpringBoot.service.CustomersRepo;

@Controller
public class MainController {
	@Autowired
private CustomersRepo cr;

@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Spring Boot + JDBC + JSP";
		model.addAttribute("message", message);
		return "index";
	}

	@RequestMapping(value = { "/moneyList" }, method = RequestMethod.GET)
	    public String customerMoney(Model model) {
	 List<Customer> list = cr.getCustomerPayments();
	
	       model.addAttribute("customerMoney", list);
	 
	        return "customerMoney";
	
}
}