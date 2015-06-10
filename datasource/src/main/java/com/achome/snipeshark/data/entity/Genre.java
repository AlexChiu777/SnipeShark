package com.achome.snipeshark.data.entity;



import javax.persistence.*;

/**
 * Created by Alex on 6/9/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "GENRE")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long genreId;

    private String name;

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
