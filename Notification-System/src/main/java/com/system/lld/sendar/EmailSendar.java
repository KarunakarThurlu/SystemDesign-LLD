package com.system.lld.sendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.system.lld.entity.Notification;
import com.system.lld.enums.NotificationType;

@Component
public class EmailSendar implements NotificationSendar {
	
	private static final Logger log = LoggerFactory.getLogger(EmailSendar.class);

	@Override
	public void sendNotification(Notification notification) {
		log.info("Sending Email Notification : {}", notification);
	}

	@Override
	public NotificationType getNotificationType() {
		return NotificationType.EMAIL;
	}

}
