package com.thinkconstructive.restdemo.model;

public class CloudVendor {



	private String VendorId;
	private String VendorName;
	private String VendorAdress;
	private String VendorPhoneNumber;
	
	
	public CloudVendor() {
		
	
	
	}
	
	
	public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorPhoneNumber) {
		VendorId = vendorId;
		VendorName = vendorName;
		VendorAdress = vendorAdress;
		VendorPhoneNumber = vendorPhoneNumber;

}
	
	public String getVendorId() {
		return VendorId;
	}


	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}


	public String getVendorName() {
		return VendorName;
	}


	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}


	public String getVendorAdress() {
		return VendorAdress;
	}


	public void setVendorAdress(String vendorAdress) {
		VendorAdress = vendorAdress;
	}


	public String getVendorPhoneNumber() {
		return VendorPhoneNumber;
	}


	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		VendorPhoneNumber = vendorPhoneNumber;
	}

}



