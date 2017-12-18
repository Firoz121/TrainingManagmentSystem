package com.practice.scms.model;


/**
 * 
 * user class hold the data about user and traverse it to layer by layer. 
 *
 */
public class User {
	 
	/**
	 * id of user and it is PK and AI.
	 */
	 
		private Integer id;
		/**
		 * name of user.
		 */
		private String name;
		/**
		 * contact of user.
		 */
		private String contact;
		/**
		 * username of user.
		 */
		
		private String username;
		/**
		 * batch selected by user user .
		 */
		
		private String batch;
		
		/**
		 * password of user .
		 */
		private String password;
		
		/**
		 * role of user by default 2, 1:Trainer, 2:Trainee.
		 */
		private Integer role;
		/**
		 * status of user is by default 1, 1:Active, 2:Inactive.
		 */
		private Integer status;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
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
		
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public Integer getRole() {
			return role;
		}
		public void setRole(Integer role) {
			this.role = role;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		

}
