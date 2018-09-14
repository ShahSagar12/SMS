package com.sms.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_Library")
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LM_Id")
	private int libId;
	
	@Column(name="Book_Name")
	private String bookName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Issued_Date")
	private Date issuedDate;
	
		
	@Temporal(TemporalType.DATE)
	@Column(name="Expiry_Date")
	private Date expiryDate;
	
	@Column(name="Fine")
	private double fine;
	
	@Column(name="Status")
	private int status;
	
	
	

	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Library(int libId, String bookName, Date issuedDate, Date expiryDate, double fine, int status) {
		super();
		this.libId = libId;
		this.bookName = bookName;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.fine = fine;
		this.status=status;
	}
	
	public Library(String bookName, Date issuedDate, Date expiryDate, double fine, int status) {
		super();
		this.bookName = bookName;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.fine = fine;
		this.status=status;
	}
	public Library() {
		
	}
	
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", bookName=" + bookName + ", issuedDate=" + issuedDate + ", expiryDate="
				+ expiryDate + ", fine=" + fine + ", status=" + status + "]";
	}
	
	
	
	
	
	
	

}
