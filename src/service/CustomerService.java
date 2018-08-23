package service;

import customermeta.Customer;
import customermeta.Customermeta;
import customermeta.PageBean;

import java.util.List;

public class CustomerService {
	Customermeta customermeta = new Customermeta();
	
	public void add(Customer customer) {
		customermeta.add(customer);
	}
	
	public PageBean<Customer> findAll(int pc, int pr){
		return customermeta.findAll(pc, pr);
	}
	
	public Customer find(String id) {
		return customermeta.find(id);
	}
	
	public void edit(Customer customer) {
		customermeta.edit(customer);
	}
	
	public void delete(String id) {
		customermeta.delete(id);
	}
	
	public PageBean<Customer> query(Customer customer, int pc, int pr){
		return customermeta.query(customer, pc, pr);
	}
	
	
}
