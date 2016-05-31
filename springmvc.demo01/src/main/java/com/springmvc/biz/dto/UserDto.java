package com.springmvc.biz.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = -4295569187875478382L;
	
	/** 姓名 */
	private String name;
	/** 密码 */
	private String pass;
	/** 年龄 */
	private Integer age;
	/** 性别：  1表示男，2表示女 */
	private Integer sex;
	/** 工作 */
	private JobDto jobDto;
	
	public JobDto getJobDto() {
		return jobDto;
	}
	public void setJobDto(JobDto jobDto) {
		this.jobDto = jobDto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
