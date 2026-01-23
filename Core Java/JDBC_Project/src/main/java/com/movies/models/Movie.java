package com.movies.models;

public class Movie {
    private int id;
    private String name;
    private String streamingOn;

    public Movie( String name, String streamingOn) {
        this.name = name;
        this.streamingOn = streamingOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreamingOn() {
        return streamingOn;
    }

    public void setStreamingOn(String streamingOn) {
        this.streamingOn = streamingOn;
    }
}
