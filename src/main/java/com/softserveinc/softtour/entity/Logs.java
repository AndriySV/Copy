package com.softserveinc.softtour.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Logs")
public class Logs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	
	@Column(name = "date", nullable = false)
	private Date date;

	@Column(name = "level", nullable = false, length = 10)
	private String level;

	@Column(name = "logger", nullable = false, length = 150)
	private String logger;
	
	@Column(name = "method", nullable = false, length = 50)
	private String method;
	
	@Column(name = "line", nullable = false, length = 3)
	private int line;
	
	@Column(name = "message", nullable = false )
	private String message;

	public Logs() {
	}

	public Logs(long id, Date date, String level, String logger, String method,
			int line, String message) {
		this.id = id;
		this.date = date;
		this.level = level;
		this.logger = logger;
		this.method = method;
		this.line = line;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}