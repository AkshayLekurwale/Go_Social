package com.social.service;

import java.util.List;

import com.social.exception.ChatException;
import com.social.exception.MessageException;
import com.social.exception.UserException;
import com.social.model.Message;
import com.social.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
