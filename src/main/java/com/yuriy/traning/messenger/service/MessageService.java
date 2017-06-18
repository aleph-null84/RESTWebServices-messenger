package com.yuriy.traning.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.yuriy.traning.messenger.model.*;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World!", "Yuriy");
		Message m2 = new Message(2L, "Some Text!", "Homer");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
