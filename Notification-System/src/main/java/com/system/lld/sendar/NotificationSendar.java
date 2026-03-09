package com.system.lld.sendar;

import com.system.lld.entity.Notification;
import com.system.lld.enums.NotificationType;

public interface NotificationSendar {
	void sendNotification(Notification notification);
	NotificationType getNotificationType();
}
