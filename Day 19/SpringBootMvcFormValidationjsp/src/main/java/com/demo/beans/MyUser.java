package com.demo.beans;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class MyUser {
	@Size(min=3,max=50)
	private String name;
	
	@NotBlank
	@Email(message="pla enter valid email address")
	private String email;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private String profession;
	
	@Size(max=100)
	private String note;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date birthday;
	
	@AssertTrue
	private boolean married;
	
	@Min(value=20_000)
	@Max(value=300_000)
	private long income;

	public MyUser() {
		super();
	}

	public MyUser(@Size(min = 3, max = 50) String name,
			@NotBlank @Email(message = "pla enter valid email address") String email, @NotBlank String gender,
			@NotBlank String profession, @Size(max = 100) String note, Date birthday, @AssertTrue boolean married,
			@Min(20000) @Max(300000) long income) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.profession = profession;
		this.note = note;
		this.birthday = birthday;
		this.married = married;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + ", email=" + email + ", gender=" + gender + ", profession=" + profession
				+ ", note=" + note + ", birthday=" + birthday + ", married=" + married + ", income=" + income + "]";
	}
	
	
	

}
