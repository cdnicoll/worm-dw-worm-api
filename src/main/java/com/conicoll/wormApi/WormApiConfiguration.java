package com.conicoll.wormApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

/**
 * Created by conicoll on 2015-12-17.
 */
public class WormApiConfiguration extends Configuration
{
    @JsonProperty
    private DataSourceFactory database = new DataSourceFactory();

    /**
     * Get Instance of Database
     *
     * @return DataSourceFactory database
     */
    public DataSourceFactory getDataSourceFactory()
    {
        return database;
    }
}
