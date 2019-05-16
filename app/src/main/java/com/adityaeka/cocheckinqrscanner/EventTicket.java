package com.adityaeka.cocheckinqrscanner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventTicket {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("nameEvent")
    @Expose
    private String nameEvent;
    @SerializedName("locationEvent")
    @Expose
    private String locationEvent;
    @SerializedName("posterEvent")
    @Expose
    private String posterEvent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getLocationEvent() {
        return locationEvent;
    }

    public void setLocationEvent(String locationEvent) {
        this.locationEvent = locationEvent;
    }

    public String getPosterEvent() {
        return posterEvent;
    }

    public void setPosterEvent(String posterEvent) {
        this.posterEvent = posterEvent;
    }

}