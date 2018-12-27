package lviv.SpringBoot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lviv.SpringBoot.model.Office;

@Repository
public class OfficeDAOimp implements OfficesDAO{
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public OfficeDAOimp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<Office> getOfficeIncomePeriod(String dateStart, String dateEnd) {
		String sql = "SELECT offices.officeCode c, offices.city, offices.country, SUM(payments.amount) AS total " + 
				"FROM offices INNER JOIN employees USING (officeCode) INNER JOIN customers " + 
				"ON employees.employeeNumber = customers.salesRepEmployeeNumber " + 
				"INNER JOIN payments USING (customerNumber) WHERE payments.paymentDate " + 
				"BETWEEN '" + dateStart + "' AND '" + dateEnd + "' GROUP BY c " + 
				"ORDER BY total DESC";
		
		List<Office> result = jdbcTemplate.query(sql, (rs, rowNum) -> new Office(rs.getInt("c"),
				rs.getString("city"), rs.getString("country"), rs.getDouble("total")));

		return result;
	}

}
