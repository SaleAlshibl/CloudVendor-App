package com.thinkconstructive.restdemo.controllerr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService 
{
	CloudVendor cloudvendor;
	
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) 
	{
		return cloudvendor;
//			return new CloudVendor("C1","Vendor 1","Address One","xxxxx");
		
	}

	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) 
	{
		this.cloudvendor = cloudvendor;
		return "Cloud Vendor Created Successfully";
		
	}
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) 
	{
		this.cloudvendor = cloudvendor;
		return "Cloud Vendor Update Successfully";
		
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) 
	{
		this.cloudvendor = null;
		return "Cloud Vendor Deleted Successfully";
		
	}
}
