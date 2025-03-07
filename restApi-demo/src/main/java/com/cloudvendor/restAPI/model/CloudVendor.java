package com.cloudvendor.restAPI.model;

public class CloudVendor {
    private String vendorId;
    private  String vendorName;
    private String vendorAddress;
    private String vendorMobileNumber;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorMobileNumber() {
        return vendorMobileNumber;
    }

    public void setVendorMobileNumber(String vendorMobileNumber) {
        this.vendorMobileNumber = vendorMobileNumber;
    }

    public CloudVendor() {
    }

    public CloudVendor(String vendorName, String vendorId, String vendorAddress, String vendorMobileNumber) {
        this.vendorName = vendorName;
        this.vendorId = vendorId;
        this.vendorAddress = vendorAddress;
        this.vendorMobileNumber = vendorMobileNumber;
    }




}
