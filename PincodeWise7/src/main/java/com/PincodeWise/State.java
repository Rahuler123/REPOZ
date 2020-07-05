package com.PincodeWise;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class State {
    @Id
    
    @Column(name = "state")
    private String state;
    private String stateNameCaps;
//    private String countryCode;
//    private String districtCode;
//    private String status;
//    private String stateNameReg;
//    private int min_pin_prefix;
//    private int max_pin_prefix;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateCode_FK", referencedColumnName = "state")
    private List<District> districts;

	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getStateNameCaps() {
		return stateNameCaps;
	}


	public void setStateNameCaps(String stateNameCaps) {
		this.stateNameCaps = stateNameCaps;
	}


	public List<District> getDistricts() {
		return districts;
	}


	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}


	public State(String state, String stateNameCaps, List<District> districts) {
		super();
		this.state = state;
		this.stateNameCaps = stateNameCaps;
		this.districts = districts;
	}


	public State() {
		
	}
}


