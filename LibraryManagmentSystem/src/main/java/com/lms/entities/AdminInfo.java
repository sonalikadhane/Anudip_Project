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
@Table(name="admin_details")
public class AdminInfo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adminid",length =20)
	private int Id;
	@Column(name="adminname",length =30)
	private String name;
	@Column(name="adminadd",length =50)
	private String address;
	@Column(name="adminphno",length =30)
	private String phNo;
	
	
	

}
