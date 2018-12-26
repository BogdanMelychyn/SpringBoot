package lviv.SpringBoot.service;


import java.util.List;

import lviv.SpringBoot.model.Customer;

public interface CustomersRepo {
	
    List<Customer> getCustomerPayments();
    
    
    
}
