package com.java.map.based.practice;

public class Team {

	String city;
	String department;

	public Team(String city, String department) {
		super();
		this.city = city;
		this.department = department;
	}

	@Override
	public final boolean equals(Object obj) {

		if (obj == this)
			return true;

		if (obj == null)
			return false;
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		return true;
	}

	@Override
	public final int hashCode() {
		int result = 17;
		if (city != null) {
			result = 31 * result + city.hashCode();
		}
		if (department != null) {
			result = 31 * result + department.hashCode();
		}
		return result;
	}
}