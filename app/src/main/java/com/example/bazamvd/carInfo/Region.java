package com.example.bazamvd.carInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Region {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_ua")
    @Expose
    private String nameUa;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("old_code")
    @Expose
    private String oldCode;
    @SerializedName("new_code")
    @Expose
    private String newCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUa() {
        return nameUa;
    }

    public void setNameUa(String nameUa) {
        this.nameUa = nameUa;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getOldCode() {
        return oldCode;
    }

    public void setOldCode(String oldCode) {
        this.oldCode = oldCode;
    }

    public String getNewCode() {
        return newCode;
    }

    public void setNewCode(String newCode) {
        this.newCode = newCode;
    }

}