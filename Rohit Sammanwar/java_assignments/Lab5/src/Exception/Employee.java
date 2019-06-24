package Exception;

import java.util.Scanner;

public class Employee {
	private String lname;
	private String fname;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String lname = sc.nextLine();
		System.out.println("Enter Last Name:");
		String fname = sc.nextLine();
		Employee e = new Employee();
		e.setFname(fname);
		e.setLname(lname);
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		if(lname!=null)
		this.lname = lname;
		else
			throw new Exercise4("Invalid name:");
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		if(lname!=null)
			this.fname = fname;
			else
				throw new Exercise4("Invalid name:");

		
	}

}
