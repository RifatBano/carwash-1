package com.cg.casestudy.carwash.entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CustomerRegister")
public class CustomerRegistrationDetails{
		/**
	 * 
	 */
		private String customername;
		private String password;
		
		public CustomerRegistrationDetails(String customername, String password) {
			super();
			this.customername = customername;
			this.password = password;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
