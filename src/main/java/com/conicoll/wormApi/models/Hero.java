package com.conicoll.wormApi.models;

/**
 * Created by conicoll on 2015-12-17.
 */
public class Hero
{
    private final int id;
    private final String heroName;
    private final String streetName;
    private final String description;
    private final int factionId;

    public Hero()
    {
        this.id = 0;
        this.heroName = null;
        this.streetName = null;
        this.description = null;
        this.factionId = 0;
    }

    public Hero(int id, String heroName, String streetName, String description, int factionId)
    {
        this.id = id;
        this.heroName = heroName;
        this.streetName = streetName;
        this.description = description;
        this.factionId = factionId;
    }

    public int getId() {
        return id;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getDescription() {
        return description;
    }

    public int getFactionId() {
        return factionId;
    }
}
