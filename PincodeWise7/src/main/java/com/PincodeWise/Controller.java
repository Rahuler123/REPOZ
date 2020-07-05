package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private PincodeRepo pincodeRepository;
    @Autowired
    private DistrictRepo districtRepository;
//    @Autowired
//    private  pincodeRepoService pincodeRepoService;
	
	
    
    @Autowired
    private StateRepo stateRepository;

//    @PostMapping("/create")
//    public Pincode create(@RequestBody OrderRequest request){
//       return pincodeRepository.save(request.getPincode());
//    }

//    @GetMapping("/findAll")
//    public List<Pincode> findAll(){
//        return pincodeRepository.findAll();
//    }

//    @GetMapping("/getAll")
//    public List<PincodeResponse> getJoinInformation(){
//        return pincodeRepository.getJoinInformation();
//    }
    
//    @GetMapping("/find")
//    public List<PincodeResponse> findByPincode(@RequestParam int pincode){
//        return pincodeRepository.findByPincode(pincode);
//    }
    
    @GetMapping("/pincode/{pincode}")
    public List<Pincode> findByPincode(@PathVariable int pincode){
        return pincodeRepository.findByPincode(pincode);
    }

    @GetMapping("/state/{state}")
    public List<State> findByState(@PathVariable String state){
        return stateRepository.findByState(state);
    }
    
    
//    
//    @GetMapping("/getDistrict")
//    public List<District> getJoinInformationnn(){
//        return districtRepository.getJoinInformationnn();
//    }
    
//    @GetMapping("/state/{state}")
//    public List<State> getStatess(@PathVariable String state){
//        return stateRepository.getStateDis(state);
//    }
    
    
    
//    @GetMapping("/getInfo/{id}")
//    public List<OrderResponse> finByString(){
//        return ((Controller) pincodeRepository).finByString();
//    }
    
    
    
 
}
