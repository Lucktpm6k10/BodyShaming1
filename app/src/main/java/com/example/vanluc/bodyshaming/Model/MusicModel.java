package com.example.vanluc.bodyshaming.Model;

public class MusicModel {
    private String nameSong;
    private String nameSinger;
    private String linkSong ;

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }

    public MusicModel(String nameSong, String nameSinger, String linkSong) {

        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.linkSong = linkSong;
    }
}
