package com.example.admin.trialforevents;


import android.os.Parcelable;

public class Event  {

    private String title, desc, location, category, price, imageUrl;

    private String from_date, to_date, from_time, to_time,  fbLink, webLink, contact, club;

    public Event(String title, String desc, String location, String category, String price,
                 String imageUrl, String from_date, String to_date, String from_time, String to_time,
                 String fbLink, String webLink, String contact, String club) {
        this.title = title;
        this.desc = desc;
        this.location = location;
        this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
        this.from_date = from_date;
        this.to_date = to_date;
        this.from_time = from_time;
        this.to_time = to_time;
        this.fbLink = fbLink;
        this.webLink = webLink;
        this.contact = contact;
        this.club = club;
    }

    public Event(){

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getFrom_time() {
        return from_time;
    }

    public void setFrom_time(String from_time) {
        this.from_time = from_time;
    }

    public String getTo_time() {
        return to_time;
    }

    public void setTo_time(String to_time) {
        this.to_time = to_time;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

}
