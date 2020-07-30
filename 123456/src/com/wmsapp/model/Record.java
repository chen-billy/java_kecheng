package com.wmsapp.model;

import java.util.Date;

public class Record {
	private Date r_Date;
	private String g_ID;
	private int r_Number;
	private String s_ID;
	private String r_Type;
	public Date getR_Date() {
		return r_Date;
	}
	public void setR_Date(Date r_Date) {
		this.r_Date = r_Date;
	}
	public String getG_ID() {
		return g_ID;
	}
	public void setG_ID(String g_ID) {
		this.g_ID = g_ID;
	}
	public int getR_Number() {
		return r_Number;
	}
	public void setR_Number(int r_Number) {
		this.r_Number = r_Number;
	}
	public String getS_ID() {
		return s_ID;
	}
	public void setS_ID(String s_ID) {
		this.s_ID = s_ID;
	}
	public String getR_Type() {
		return r_Type;
	}
	public void setR_Type(String r_Type) {
		this.r_Type = r_Type;
	}
	public Record(Date r_Date, String g_ID, int r_Number, String s_ID, String r_Type) {
		super();
		this.r_Date = r_Date;
		this.g_ID = g_ID;
		this.r_Number = r_Number;
		this.s_ID = s_ID;
		this.r_Type = r_Type;
	}
}
