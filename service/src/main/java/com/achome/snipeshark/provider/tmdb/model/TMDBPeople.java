package com.achome.snipeshark.provider.tmdb.model;

import com.achome.snipeshark.provider.tmdb.model.advanced.CommonTMDBData;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBPeople extends CommonTMDBData {
    private String credit_id;
    private String character;
    private int order;
    private String profile_path;
    private String department;
    private String job;

    public String getCredit_id() {
        return credit_id;
    }

    public void setCredit_id(String credit_id) {
        this.credit_id = credit_id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getProfile_path() {
        return profile_path;
    }

    public void setProfile_path(String profile_path) {
        this.profile_path = profile_path;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
