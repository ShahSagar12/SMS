package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VehicleId")
	private int vehId;

	@Column(name = "Vehicle_Registration_No")
	private String vehRegNo;

	@Column(name = "Vehicle_Route")
	private String vehRoute;

	public Vehicle(int vehId, String vehRegNo, String vehRoute) {
		super();
		this.vehId = vehId;
		this.vehRegNo = vehRegNo;
		this.vehRoute = vehRoute;
	}

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public String getVehRegNo() {
		return vehRegNo;
	}

	public void setVehRegNo(String vehRegNo) {
		this.vehRegNo = vehRegNo;
	}

	public String getVehRoute() {
		return vehRoute;
	}

	public void setVehRoute(String vehRoute) {
		this.vehRoute = vehRoute;
	}

	@Override
	public String toString() {
		return "Vehicle [vehId=" + vehId + ", vehRegNo=" + vehRegNo + ", vehRoute=" + vehRoute + "]";
	}

}
