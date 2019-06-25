package com.example.domain;

import lombok.Builder;

@Builder
public class User {
	private Integer id;

	private String username;

	private String age;

	private String address;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", age='" + age + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
