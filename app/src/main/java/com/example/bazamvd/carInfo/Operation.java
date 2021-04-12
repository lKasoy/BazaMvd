package com.example.bazamvd.carInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Operation {

    @SerializedName("isLast")
    @Expose
    private Boolean isLast;
    @SerializedName("regAt")
    @Expose
    private String regAt;
    @SerializedName("modelYear")
    @Expose
    private Integer modelYear;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("operation")
    @Expose
    private String operation;
    @SerializedName("address")
    @Expose
    private String address;

    public Boolean getIsLast() {
        return isLast;
    }

    public void setIsLast(Boolean isLast) {
        this.isLast = isLast;
    }

    public String getRegAt() {
        return regAt;
    }

    public void setRegAt(String regAt) {
        this.regAt = regAt;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}