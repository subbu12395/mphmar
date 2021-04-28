package com.mph.model;


import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable<Employee>,Serializable{

	private int eid;
	private String ename;
	private Salary salary;
	private String dept;

	public Employee() {
		super();
		//System.out.println("From Emp constr...");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}	

	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary= " + salary + ",dept=" + dept + "]";
	}
	

	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return (e1.getEname().compareTo(e2.getEname()));
		}
	};

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	};

	
}

























 
	

	