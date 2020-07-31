package com.cranajit.websocketProject.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.cranajit.websocketProject.model.Message;

@Controller
public class CharController {

	@MessageMapping(value = "/chat.register")
	@SendTo(value = "/topic/public")
	public Message register(@Payload Message message
			, SimpMessageHeaderAccessor simpMessageHeaderAccessor) {
		simpMessageHeaderAccessor
		.getSessionAttributes()
		.put("username", message.getSender());
		return message;
	}
	
	@MessageMapping(value = "/chat.send")
	@SendTo(value = "/topic/public")
	public Message sendMessage(@Payload Message message) {
		return message;
	}
}
