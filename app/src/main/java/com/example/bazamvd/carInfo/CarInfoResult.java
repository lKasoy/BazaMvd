package com.example.bazamvd.carInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CarInfoResult {

    @SerializedName("digits")
    @Expose
    private String digits;
    @SerializedName("region")
    @Expose
    private Region region;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("photoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("stolen")
    @Expose
    private Boolean stolen;
    @SerializedName("operations")
    @Expose
    private List<Operation> operations = null;

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Boolean getStolen() {
        return stolen;
    }

    public void setStolen(Boolean stolen) {
        this.stolen = stolen;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

}