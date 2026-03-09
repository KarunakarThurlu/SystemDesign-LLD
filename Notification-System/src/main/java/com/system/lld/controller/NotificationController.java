package com.system.lld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.lld.entity.Notification;
import com.system.lld.service.NotificationService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class NotificationController {
	
	private static final Logger log = LoggerFactory.getLogger(NotificationController.class);
	
	private NotificationService notificationService;
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService =  notificationService;
	}
	
	@PostMapping("/send")
	public Mono<String> sendNotification(@RequestBody Notification notification) {
		log.info("Notification body : {}",notification);
		notificationService.sendNotification(notification);
		return Mono.just("Notification Sent");
	}
}
