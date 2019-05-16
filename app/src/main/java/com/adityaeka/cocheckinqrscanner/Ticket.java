package com.adityaeka.cocheckinqrscanner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("priceTicket")
    @Expose
    private Integer priceTicket;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("eventTicket")
    @Expose
    private EventTicket eventTicket;
    @SerializedName("userTicket")
    @Expose
    private UserTicket userTicket;
    @SerializedName("categoryTicket")
    @Expose
    private String categoryTicket;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public Integer getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(Integer priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventTicket getEventTicket() {
        return eventTicket;
    }

    public void setEventTicket(EventTicket eventTicket) {
        this.eventTicket = eventTicket;
    }

    public UserTicket getUserTicket() {
        return userTicket;
    }

    public void setUserTicket(UserTicket userTicket) {
        this.userTicket = userTicket;
    }

    public String getCategoryTicket() {
        return categoryTicket;
    }

    public void setCategoryTicket(String categoryTicket) {
        this.categoryTicket = categoryTicket;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}