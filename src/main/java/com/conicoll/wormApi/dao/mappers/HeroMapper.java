package com.conicoll.wormApi.dao.mappers;

import com.conicoll.wormApi.models.Hero;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by conicoll on 2015-12-17.
 */
public class HeroMapper implements ResultSetMapper<Hero>
{
    public Hero map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Hero(r.getInt("id"), r.getString("heroname"), r.getString("streetname"), r.getString("description"), r.getInt("factionId"));
    }

}
