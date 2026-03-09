package com.system.lld.factory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.system.lld.entity.Notification;
import com.system.lld.enums.NotificationType;
import com.system.lld.sendar.NotificationSendar;

@Component
public class NotificationSendarFactory {
	
	private final Map<NotificationType, NotificationSendar> sendarMap ;
	
	public NotificationSendarFactory(List<NotificationSendar> sendars) {
		sendarMap = sendars.stream()
				           .collect(Collectors.toMap(NotificationSendar::getNotificationType, Function.identity()));
	}
	
	public NotificationSendar getNotificationSendar(Notification notification) {
		if(notification.getType()==null)
			throw new IllegalArgumentException("UnSupported Notification Type");
		return sendarMap.get(notification.getType()); 
	}
}
