package com.lms.entity;

	import javax.persistence.*;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;


	@Entity
	@Table(name = "admin_details")
	public class AdminDetails {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "username")
	    private String username;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "email")
	    private String email;
	    
		public AdminDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AdminDetails(String username, String password, String email) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "AdminDetails [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
					+ "]";
		}

	  

}
