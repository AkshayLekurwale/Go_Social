package com.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
