package com.system.lld.sendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.system.lld.entity.Notification;
import com.system.lld.enums.NotificationType;

@Component
public class PushNotification implements NotificationSendar{
	private static final Logger log = LoggerFactory.getLogger(PushNotification.class);

	@Override
	public void sendNotification(Notification notification) {
		log.info("Sending Push Notification : {}", notification);
	}

	@Override
	public NotificationType getNotificationType() {
		return NotificationType.PUSH;
	}
}
