package com.yuriy.traning.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yuriy.traning.messenger.database.DatabaseClass;
import com.yuriy.traning.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		if (messages.isEmpty()) {
		    System.out.println("Constructor of MessageService");
		    messages.put(1L, new Message(1L, "Hello World!", "Yuriy"));
		    messages.put(2L, new Message(2L, "Some Text!", "Homer"));
		}
	}
	
	/*
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World!", "Yuriy");
		Message m2 = new Message(2L, "Some Text!", "Homer");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	*/
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		System.out.println("id " + message.getId());
		System.out.println("message before " + message.getMessage());
		messages.put(message.getId(), message);
		System.out.println("message after " + message.getMessage());
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}	

}
