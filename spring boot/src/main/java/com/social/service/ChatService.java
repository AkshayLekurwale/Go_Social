package com.social.service;

import java.util.List;

import com.social.exception.ChatException;
import com.social.exception.UserException;
import com.social.model.Chat;
import com.social.request.GroupChatRequest;

public interface ChatService {

	public Chat createChat(Integer reqUserId, Integer userId2, boolean isGroup) throws UserException;
	
	public Chat findChatById(Integer chatId) throws ChatException;
	
	public List<Chat> findAllChatByUserId(Integer userId) throws UserException;
	
	
	public Chat createGroup(GroupChatRequest req,Integer reqUerId) throws UserException;
	
	public Chat addUserToGroup(Integer userId, Integer chatId) throws UserException, ChatException;
	
	public Chat renameGroup(Integer chatId,String groupName, Integer reqUserId) throws ChatException, UserException;
	
	public Chat removeFromGroup(Integer chatId,Integer userId, Integer reqUser) throws UserException,ChatException;
	
	public Chat deleteChat(Integer chatId, Integer userId) throws ChatException, UserException;
	
}
