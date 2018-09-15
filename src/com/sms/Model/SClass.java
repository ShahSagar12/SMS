package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_class")
public class SClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Class_Id")
	private String classId;

	@Column(name = "Class_Name")
	private String className;

	public SClass() {

	}

	public SClass(String classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "SClass [classId=" + classId + ", className=" + className + "]";
	}

}
