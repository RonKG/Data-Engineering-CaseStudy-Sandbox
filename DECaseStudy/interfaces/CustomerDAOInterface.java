package interfaces;

import java.util.List;

import modelClasses.*;

public interface CustomerDAOInterface {

	public Customer getCustomer();
	public void updateCustomer(Customer customer);
	public List<Customer> getMonthlyBill();
	public List<Customer> viewSelectDates();
}
