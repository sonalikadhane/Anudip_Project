package com.lms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_details")

public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="userid",length =20)
	private int Aid;
	@Column(name="username",length =30)
	private String Uname;
	@Column(name="useradd",length =50)
	private String Uaddress;
	@Column(name="userphno",length =30)
	private String UphNo;

}
