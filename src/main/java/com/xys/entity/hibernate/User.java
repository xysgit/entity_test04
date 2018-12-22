package com.xys.entity.hibernate;

import java.util.Date;

import javax.persistence.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.xys.entity.ZbaseEntity;

@Entity
public class User extends ZbaseEntity {

	
	private String username;
	private Integer age;
	private Date birthday;
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@JSONField(format="yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
