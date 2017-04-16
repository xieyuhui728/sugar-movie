package com.web.dubbo.movie;


import com.web.model.Movie;
import com.web.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import sugar.api.movie.MovieVoService;
import sugar.vo.MovieVo;

/**
 * Created by xieyuhui on 2017/4/16.
 * dubbo
 */
public class MovieVoServiceImpl implements MovieVoService {

    @Autowired
    @Qualifier("movieService")
    private MovieService movieService;

    @Override
    public String getName(String name) {
        return movieService.getName(name);
    }

    @Override
    public MovieVo getMovie(Long aLong) {
        MovieVo vo = new MovieVo();
        Movie movie = movieService.getMovie(1L);
        vo.setId(movie.getId());
        vo.setMovieName(movie.getMovieName());
        vo.setCteateTime(movie.getCteateTime());
        return vo;
    }

    @Override
    public int delMovie(Long aLong) {
        return 0;
    }
}
