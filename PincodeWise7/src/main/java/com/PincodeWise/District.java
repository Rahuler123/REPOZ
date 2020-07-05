package com.PincodeWise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class District {
	
	@Id
	@Column(name="districtCode")
	private String districtCode;
    private String districtName;
    private String stateCode;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pincode_fk", referencedColumnName = "pincode")
    private Pincode pincode;
    
    public District() {
    	
    }

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Pincode getPincode() {
		return pincode;
	}

	public void setPincode(Pincode pincode) {
		this.pincode = pincode;
	}

	public District(String districtCode, String districtName, String stateCode, Pincode pincode) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.stateCode = stateCode;
		this.pincode = pincode;
	}

    
    
}
