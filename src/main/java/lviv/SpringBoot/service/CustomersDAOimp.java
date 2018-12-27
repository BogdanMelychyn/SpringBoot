package lviv.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import lviv.SpringBoot.model.Customer;

@Repository
public class CustomersDAOimp implements CustomersDAO {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public CustomersDAOimp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Customer> getCustomerPayments() {
		String sql = "SELECT customerNumber, customerName, city, SUM(amount) AS totalAmount "
				+ "FROM customers INNER JOIN payments USING(customerNumber) "
				+ "GROUP BY  customerNumber ORDER BY  totalAmount DESC";
		List<Customer> result = jdbcTemplate.query(sql, (rs, rowNum) -> new Customer(rs.getInt("customerNumber"),
				rs.getString("customerName"), rs.getString("city"), rs.getDouble("totalAmount")));

		return result;
	}

}
