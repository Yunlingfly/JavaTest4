package com.hand.api.service.impl;

import com.hand.api.service.IFilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.IFilmDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmService implements IFilmService {
    @Autowired
    IFilmDAO iFilmDAO;

    @Override
    public void insertOne(Film film) throws Exception{
        System.out.print("have aop function");

        iFilmDAO.insertOne(film);
    }

    @Override
    public void insertOneWithException(Film film) throws Exception{
        System.out.print("have aop function");

        iFilmDAO.insertOne(film);
        throw new RuntimeException("some test exception");
    }
}
