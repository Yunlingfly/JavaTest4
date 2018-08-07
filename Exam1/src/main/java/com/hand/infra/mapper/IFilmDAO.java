package com.hand.infra.mapper;

import com.hand.domain.entity.Film;
import org.springframework.stereotype.Component;

@Component
public interface IFilmDAO {
    void insertOne(Film film);
}
