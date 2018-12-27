package lviv.SpringBoot.model;

public class Customer {

	

	private Integer customerNumber;
	private String name;
	private String city;
	private Double moneySpended;

	public Customer() {
	}
	public Customer(Integer customerNumber, String name, String city, Double moneySpended) {

		this.customerNumber = customerNumber;
		this.name = name;
		this.city = city;
		this.moneySpended = moneySpended;
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMoneySpended() {
		return moneySpended;
	}

	public void setMoneySpended(Double moneySpended) {
		this.moneySpended = moneySpended;
	}

	@Override
	public String toString() {
		return "Customer [ customerID= " + customerNumber + ", name= " + name + ", city= " + city + ", moneySpended= "
				+ moneySpended + " ]";
	}

}
