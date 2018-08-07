package com.hand.api.service;

import com.hand.domain.entity.Film;

public interface IFilmService {
    void insertOne(Film film) throws Exception;
    void insertOneWithException(Film film) throws Exception;
}
