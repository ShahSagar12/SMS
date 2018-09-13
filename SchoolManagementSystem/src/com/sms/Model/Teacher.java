package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	@Column(name="Teacher_Id")
	private int teacherId;
	
	@Column(name="Teacher_Position")
	private String teacherPosition;

	public Teacher(int teacherId, String teacherPosition) {
		super();
		this.teacherId = teacherId;
		this.teacherPosition = teacherPosition;
	}

	public Teacher(String teacherPosition) {
		super();
		this.teacherPosition = teacherPosition;
	}

	public Teacher() {
		
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherPosition() {
		return teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherPosition=" + teacherPosition + "]";
	} 
	
	
	
	
	
	

}
