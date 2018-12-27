package lviv.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lviv.SpringBoot.model.Customer;
import lviv.SpringBoot.model.Office;
import lviv.SpringBoot.service.CustomersDAO;
import lviv.SpringBoot.service.OfficesDAO;

@Controller
public class MainController {
	@Autowired
	private CustomersDAO cr;
	@Autowired
	private OfficesDAO oDao;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Get Customers payments";
		model.addAttribute("message", message);
		return "index";
	}

	@RequestMapping(value = { "/moneyList" }, method = RequestMethod.GET)
	public String customerMoney(Model model) {
		List<Customer> list = cr.getCustomerPayments();
		model.addAttribute("customerMoney", list);
		return "customerMoney";

	}

	@RequestMapping(value = { "/officeList" }, method = RequestMethod.POST)
	public String officesIncome(Model model, @RequestParam(value = "date1") String dateStart,
			@RequestParam(value = "date2") String dateEnd) {
		List<Office> list = oDao.getOfficeIncomePeriod(dateStart, dateEnd);
		model.addAttribute("officeList", list);
		return "officeIncome";
	}

}