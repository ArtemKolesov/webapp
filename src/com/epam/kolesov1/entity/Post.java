package com.epam.kolesov1.entity;

import java.sql.Timestamp;

public class Post {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPostDate() {
		return postDate;
	}

	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	}

	private String title;
	private String content;
	private Timestamp postDate;

	public Post() {

	}

	public Post(int id, String title, String content, Timestamp postDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", postDate=" + postDate + "]";
	}

}
