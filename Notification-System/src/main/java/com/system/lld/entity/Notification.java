package com.system.lld.entity;

import java.util.Objects;

import com.system.lld.enums.NotificationType;




public class Notification {
	
	private Integer id;
	private String body;
	//@Enumerated(EnumType.STRING)
	private NotificationType type;
	private String email;
	private String phone;
	private String deviceToken;
	
	public Notification() {
		super();
	}

	public Notification(Integer id, String body, NotificationType type, String email, String phone, String deviceToken) {
		super();
		this.id = id;
		this.body = body;
		this.type = type;
		this.email = email;
		this.phone = phone;
		this.deviceToken = deviceToken;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, body, type, email, phone, deviceToken);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != getClass())
			return false;
		Notification notification = (Notification) obj;
		return Objects.equals(notification.id, this.id)
				&& Objects.equals(notification.body, this.body) 
				&& Objects.equals(notification.type, this.type)
				&& Objects.equals(notification.email, this.email)
				&& Objects.equals(notification.phone, this.phone)
				&& Objects.equals(notification.deviceToken, this.deviceToken);
	}
	
	


	@Override
	public String toString() {
		return " { id : " + id + ", body : " + body + ", type : " + type + ", email : " + email + ", phone : " + phone + ", deviceToken : " + deviceToken + " }";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public NotificationType getType() {
		return type;
	}

	public void setType(NotificationType type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	
}
