package lviv.SpringBoot.model;

public class Office {
	private Integer officeCode;
	private String city;
	private String country;
	private Double income;

	public Office() {
	}

	public Office(Integer officeCode, String city, String country, Double income) {
		
		this.officeCode = officeCode;
		this.city = city;
		this.country = country;
		this.income = income;
	}

	public Integer getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(Integer officeCode) {
		this.officeCode = officeCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Office [officeCode=" + officeCode + ", city=" + city + ", country=" + country + ", income=" + income
				+ "]";
	}

}
