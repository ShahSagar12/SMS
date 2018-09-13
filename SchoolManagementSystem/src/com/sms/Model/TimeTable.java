package com.sms.Model;


import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_TimeTable")
public class TimeTable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TimeTable_Id")
	private int id;
	
	@Column(name="TimeTable_Period")
	private int period;
	
	@Temporal(TemporalType.TIME)
	@Column(name="Starting_Time")
	private Date startingTime;
	
	@Temporal(TemporalType.TIME)
	@Column(name="Ending_Time")
	private Date endingTime;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Teacher_Id")
	private Teacher teacher;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Subject_Id")
	private Subject subject;


	public TimeTable() {
		
	}


	public TimeTable(int id, int period, Date startingTime, Date endingTime, Teacher teacher,Subject subject) {
		super();
		this.id = id;
		this.period = period;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.teacher = teacher;
		this.subject=subject;
	}


	public TimeTable(int period, Date startingTime, Date endingTime, Teacher teacher,Subject subject) {
		super();
		this.period = period;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.teacher = teacher;
		this.subject=subject;
	}


	@Override
	public String toString() {
		return "TimeTable [id=" + id + ", period=" + period + ", startingTime=" + startingTime + ", endingTime="
				+ endingTime + ", teacher=" + teacher + ",subject=" + subject + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPeriod() {
		return period;
	}


	public void setPeriod(int period) {
		this.period = period;
	}


	public Date getStartingTime() {
		return startingTime;
	}


	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}


	public Date getEndingTime() {
		return endingTime;
	}


	public void setEndingTime(Date endingTime) {
		this.endingTime = endingTime;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}	
	
	
	

}
