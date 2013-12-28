package org.jstrava.entities;

/**
 * Created by roberto on 12/27/13.
 */
public class Comment {

    private Integer id;
    private Integer resource_state;
    private String text;
    private Athlete athlete;
    private String created_at;


    @Override
    public String toString() {
        return text;
    }

    public Comment(Integer id) {
        this.id = id;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResource_state() {
        return resource_state;
    }

    public void setResource_state(Integer resource_state) {
        this.resource_state = resource_state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
