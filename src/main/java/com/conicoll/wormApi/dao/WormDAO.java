package com.conicoll.wormApi.dao;

import com.conicoll.wormApi.dao.mappers.HeroMapper;
import com.conicoll.wormApi.models.Hero;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by conicoll on 2015-12-17.
 */
public interface WormDAO
{
    @Mapper(HeroMapper.class)
    @SqlQuery("SELECT * FROM heroes WHERE id = :id")
    Hero getHeroById(@Bind("id") int id);


    @Mapper(HeroMapper.class)
    @SqlQuery("SELECT * FROM `heroes` WHERE `heroname` = :name")
    Hero getHeroByHeroName(@Bind("name") String name);

    @Mapper(HeroMapper.class)
    @SqlQuery("SELECT * FROM heroes")
    List<Hero> getAllHeroes();
}