package com.cranajit.websocketProject.model;

public class Message {
	private String content;
	private String sender;
	private MESSAGE_TYPE type;
	public enum MESSAGE_TYPE {
		CHAT,LEAVE,JOIN;
	}
	public Message() {
	}
	public Message(String content, String sender, MESSAGE_TYPE type) {
		super();
		this.content = content;
		this.sender = sender;
		this.type = type;
	}
	public MESSAGE_TYPE getType() {
		return type;
	}
	public void setType(MESSAGE_TYPE type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
}
