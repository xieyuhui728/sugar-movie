package com.web.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xieyuhui on 2017/4/16.
 */
public class Movie implements Serializable{
    private Long id;
    private String movieName;
    private Date cteateTime;

    public Movie() {
    }

    public Movie(Long id, String movieName, Date cteateTime) {
        this.id = id;
        this.movieName = movieName;
        this.cteateTime = cteateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }
}
