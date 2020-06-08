package com.example.quizzinga;

public class Event {
    private String event_name;
    private String theme;
    private String venue;
    private String date;
    private String time;
    private String image_url;

    public Event(String event_name, String theme, String venue, String date, String time, String image_url) {
        this.event_name = event_name;
        this.theme = theme;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.image_url = image_url;
    }

    public Event() {
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
