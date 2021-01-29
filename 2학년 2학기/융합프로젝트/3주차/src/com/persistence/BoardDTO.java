package com.persistence;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class BoardDTO {
	private int no;	
	private String title;
	private String content;
	private String id;
	private LocalDateTime regdate;
	
	
	public BoardDTO(int no, String title, String content, String id, LocalDateTime regdate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.id = id;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDateTime regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(no+" | ");
		sb.append(title+" | ");
		sb.append(content+" | ");
		sb.append(id+" | ");
		sb.append(regdate.toString()+" | ");
		
		return sb.toString();
	}			
}
