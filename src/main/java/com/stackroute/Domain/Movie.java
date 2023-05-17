package com.stackroute.Domain;

import java.util.List;

public class Movie {
    private List<Actor> act;

    public Movie() {
    }

    public Movie(List<Actor> act) {
        this.act = act;
    }

    public List<Actor> getAct() {
        return act;
    }

    public void setAct(List<Actor> act) {
        this.act = act;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "act=" + act +
                '}';
    }
}



