package com.sms.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Staff_Id")
	private Staff staff;

	public Teacher(int teacherId, String teacherPosition,Staff staff) {
		super();
		this.teacherId = teacherId;
		this.teacherPosition = teacherPosition;
		this.staff=staff;
	}

	public Teacher(String teacherPosition,Staff staff) {
		super();
		this.teacherPosition = teacherPosition;
		this.staff=staff;
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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherPosition=" + teacherPosition + ", staff=" + staff + "]";
	}
}
