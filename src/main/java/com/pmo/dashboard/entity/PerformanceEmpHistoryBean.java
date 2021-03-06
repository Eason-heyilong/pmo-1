package com.pmo.dashboard.entity;

public class PerformanceEmpHistoryBean {
	//Year 	Quarter 	DU 	RM 	Rating 	Comments
	private String year;
	private String quarter;
	private String DU;
	private String RM;
	private String rating;
	private String comments;

	private String status;
	private String empName;
	private String role;
	private String skill;
	private String bu;
	
	public PerformanceEmpHistoryBean() {
		super();
	}
	public PerformanceEmpHistoryBean(String year, String quarter, String dU, String rM, String rating,
			String comments) {
		super();
		this.year = year;
		this.quarter = quarter;
		DU = dU;
		RM = rM;
		this.rating = rating;
		this.comments = comments;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public String getDU() {
		return DU;
	}
	public void setDU(String dU) {
		DU = dU;
	}
	public String getRM() {
		return RM;
	}
	public void setRM(String rM) {
		RM = rM;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	@Override
	public String toString() {
		return "PerformanceEmpHistoryBean [year=" + year + ", quarter=" + quarter + ", DU=" + DU + ", RM=" + RM
				+ ", rating=" + rating + ", comments=" + comments + ", status=" + status + "]";
	}
	
	
	
}
