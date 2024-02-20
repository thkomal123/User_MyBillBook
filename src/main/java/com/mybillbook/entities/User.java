package com.mybillbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="user")
public class User {

	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String phoneNumber;
	private String password;
	private String role;
}
