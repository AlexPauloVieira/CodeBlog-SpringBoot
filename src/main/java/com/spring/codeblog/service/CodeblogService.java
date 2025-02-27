package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

public interface CodeblogService {

	List<Post> findAll();
	Post findById(Long Id);
	Post save(Post post);
}
