package com.web.service;


import com.web.model.Movie;

/**
 * Created by xieyuhui on 2017/4/16.
 */
public interface MovieService {
    String getName(String name);

    Movie getMovie(Long id);
}
