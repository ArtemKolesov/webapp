package com.epam.kolesov1.entity;

import java.sql.Timestamp;

public class Comment {
	private int id;
	private String author;
	private String content;
	private Timestamp date;
	private int postId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Comment() {

	}

	public Comment(int id, String author, String content, Timestamp date, int postId) {
		super();
		this.id = id;
		this.author = author;
		this.content = content;
		this.date = date;
		this.postId = postId;
	}

}
