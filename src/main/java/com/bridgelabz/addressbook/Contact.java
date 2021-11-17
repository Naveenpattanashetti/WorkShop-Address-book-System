package com.bridgelabz.addressbook;

public class Contact {
	private String firstname;
	private String lastname;
	private String city;
	private String state;
	private int zipcode;
	private String phonenumber;
	private String email;

	private String regex = "^[a-zA-Z]+$";

	/**
	 * @param firstname
	 * @param lastname
	 * @param city
	 * @param state
	 * @param zipecode
	 * @param phonumber
	 * @param email
	 * 
	 */
	public Contact(String firstname, String lastname, String city, String state, int zipcode, String phonenumber,
			String email) {
		super();
		if (firstname.matches(regex)) {
			this.firstname = firstname;
		} else {

			System.out.println("Please enter valid name");
		}
		if (lastname.matches(regex)) {
			this.lastname = lastname;
		} else {

			System.out.println("Please enter valid lastname");
		}
		if (city.matches(regex)) {
			this.city = city;
		} else {

			System.out.println("Please enter valid lastname");
		}
		if (state.matches(regex)) {
			this.state = state;
		} else {

			System.out.println("Please enter valid lastname");
		}
		if (email.matches(regex)) {
			this.email = email;
		} else {

			System.out.println("Please enter valid lastname");
		

		}
	 
		this.zipcode = zipcode;
		this.phonenumber = phonenumber;
	 
	}

	public Contact() {
	}

	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		if (firstname.matches(regex)) {
			this.firstname = firstname;
		} else {

			System.out.println("Please enter valid name");
		}

	}

	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		if (lastname.matches(regex)) {
			this.lastname = lastname;
		} else {

			System.out.println("Please enter valid lastname");
		}

	}

	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 */
	public void setCity(String city) {
		if (city.matches(regex)) {
			this.city = city;
		} else {

			System.out.println("Please enter valid lastname");
		}

	}

	public String getState() {
		return state;
	}

	/**
	 * @param state
	 */
	public void setState(String state) {
		if (state.matches(regex)) {
			this.state = state;
		} else {

			System.out.println("Please enter valid lastname");
		}

	}

	public int getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 */
	public void setZipcode(int zipcode) {

		this.zipcode = zipcode;

	}

	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber
	 */
	public void setPhonenumber(String phonenumber) {

		this.phonenumber = phonenumber;

	}

	public String getEmail() {
		return email;

	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {

		if (email.matches(regex)) {
			this.email = email;
		} else {

			System.out.println("Please enter valid lastname");
		}
	}

	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", phonenumber=" + phonenumber + ",email=" + email + "]";
	}

}
