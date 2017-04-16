package com.web.service.impl;

import com.web.model.Movie;
import com.web.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xieyuhui on 2017/4/16.
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public Movie getMovie(Long id) {
        return new Movie(1L,"速度与激情8",new Date());
    }
}
