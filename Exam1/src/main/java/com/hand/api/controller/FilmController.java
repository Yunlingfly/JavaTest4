package com.hand.api.controller;

import com.hand.api.service.IFilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.IFilmDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Component
public class FilmController {
    private IFilmService iFilmService;  // 等待xml注入

    public void insertOne(Film film) throws Exception{
//        Film film=new Film();
//        film.setFilm_id(1001);
//        film.setTitle("test Data");
//        film.setDescription("this is a test data");
//        film.setRelease_year(new Date());
//        film.setLanguage_id(1);
//        film.setOriginal_language_id(null);
//        film.setRental_duration(3);
//        film.setRental_rate(new BigDecimal("1.34"));
//        film.setLength(32);
//        film.setReplacement_cost(new BigDecimal("1.34"));
//        film.setLast_update(new Timestamp(new Date().getTime()));

        iFilmService.insertOne(film);
    }

    public void insertOneWithException(Film film) throws Exception{
        iFilmService.insertOne(film);
    }

    public IFilmService getiFilmService() {
        return iFilmService;
    }

    public void setiFilmService(IFilmService iFilmService) {
        this.iFilmService = iFilmService;
    }
}
