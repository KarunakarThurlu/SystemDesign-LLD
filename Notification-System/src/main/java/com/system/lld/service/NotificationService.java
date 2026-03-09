package com.system.lld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.system.lld.entity.Notification;
import com.system.lld.factory.NotificationSendarFactory;
import com.system.lld.sendar.NotificationSendar;

@Service
public class NotificationService {
	private static final Logger log = LoggerFactory.getLogger(NotificationService.class);
	
	private NotificationSendarFactory notificationSendarFactory;
	
	public NotificationService(NotificationSendarFactory notificationSendarFactory) {
		this.notificationSendarFactory = notificationSendarFactory;
	}
	
	public void sendNotification(Notification notification) {
		log.info("Notification body : {}",notification);
		NotificationSendar notificationSendar = notificationSendarFactory.getNotificationSendar(notification);
		notificationSendar.sendNotification(notification);
	}
	
}
