package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Address address;
	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payRoll() {
		double payRoll = 0.0;
		for (Employee em : employees) {
			payRoll += em.getSalary();
		}
		return payRoll;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Funcionários: \n");
		for(Employee emp : employees) {
            sb.append(emp.getName() + "\n");
        }
		return sb.toString();

	}
}
