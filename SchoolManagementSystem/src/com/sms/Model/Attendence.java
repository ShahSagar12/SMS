package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_attendence")
public class Attendence {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AttendenceId")
	private int attId;
	
	@Column(name = "Total_Present_Days")
	private int ttlPreDays;
	
	@Column(name = "Total_Absent_Days")
	private int ttlAbsDays;

	public int getAttId() {
		return attId;
	}

	public void setAttId(int attId) {
		this.attId = attId;
	}

	public int getTtlPreDays() {
		return ttlPreDays;
	}

	public void setTtlPreDays(int ttlPreDays) {
		this.ttlPreDays = ttlPreDays;
	}

	public int getTtlAbsDays() {
		return ttlAbsDays;
	}

	public void setTtlAbsDays(int ttlAbsDays) {
		this.ttlAbsDays = ttlAbsDays;
	}

	public Attendence(int attId, int ttlPreDays, int ttlAbsDays) {
		super();
		this.attId = attId;
		this.ttlPreDays = ttlPreDays;
		this.ttlAbsDays = ttlAbsDays;
	}

	public Attendence() {

	}

	@Override
	public String toString() {
		return "Attendence [attId=" + attId + ", ttlPreDays=" + ttlPreDays + ", ttlAbsDays=" + ttlAbsDays + "]";
	}
	
}
