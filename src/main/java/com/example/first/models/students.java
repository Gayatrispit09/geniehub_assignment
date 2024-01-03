package com.example.first.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="stu")
public class students {

  public students(String id, String stuname, String stuaddress) {
		super();
		this.id = id;
		this.stuname = stuname;
		this.stuaddress = stuaddress;
	}

  	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuaddress() {
		return stuaddress;
	}

	public void setStuaddress(String stuaddress) {
		this.stuaddress = stuaddress;
	}

  private String id;
  
  private String stuname;
  
  private String stuaddress;
  
  
}
