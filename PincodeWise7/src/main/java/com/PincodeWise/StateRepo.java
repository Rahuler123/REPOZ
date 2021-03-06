package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StateRepo extends JpaRepository<State,String> {
	
//	@Query("SELECT new com.PincodeWise.PincodeResponse(pincode,districtName,s.state_name_caps) FROM pincode_master_temporary p JOIN district_master_temporary d ON p.district_code = d.district_code JOIN  state_master_temporary s ON p.state_code = s.state_code where p.pincode = <680001>")
//    public List<PincodeResponse> getJoinInformation();
//	
//	@Query("SELECT p.pincode,d.districtCode,s.stateCode FROM Pincode p JOIN District d ON p.districtCode = d.districtCode JOIN State s ON p.stateCode = s.stateCode ")
//	 public List<Pincode> getJoinInformation();

	public List<State> findByState(String state);

}