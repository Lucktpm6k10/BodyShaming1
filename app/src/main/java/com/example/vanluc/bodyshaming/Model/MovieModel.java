package com.example.vanluc.bodyshaming.Model;

public class MovieModel {
    private String nameMovie;
    private  String conttentMovie;
    private int imageMovie;
    private String linkMovie;

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getConttentMovie() {
        return conttentMovie;
    }

    public void setConttentMovie(String conttentMovie) {
        this.conttentMovie = conttentMovie;
    }

    public int getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(int imageMovie) {
        this.imageMovie = imageMovie;
    }

    public String getLinkMovie() {
        return linkMovie;
    }

    public void setLinkMovie(String linkMovie) {
        this.linkMovie = linkMovie;
    }

    public MovieModel(int imageMovie,String nameMovie, String conttentMovie, String linkMovie) {

        this.nameMovie = nameMovie;
        this.conttentMovie = conttentMovie;
        this.imageMovie = imageMovie;
        this.linkMovie = linkMovie;
    }
}
