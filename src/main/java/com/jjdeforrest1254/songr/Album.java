package com.jjdeforrest1254.songr;

public class Album {

    public String title;
    public String artist;
    public Integer songCount;
    public Integer length;
    public String imageUrl;

    public Album(String title, String artist, Integer songCount, Integer length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String toString(){
        return this.title + " " + this.artist + " " + this.songCount + " " + this.length + " ";
    }


    public String getImageUrl(){
        return this.imageUrl;
    }


    public String getTitle() {
        return this.title;
    }


    public String getArtist() {
        return this.artist;
    }

    public Integer getSongCount() {
        return this.songCount;
    }

    public Integer getLength() {
        return this.length;
    }


//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setArtist(String artist) {
//        this.artist = artist;
//    }
//
//    public void setSongCount(Integer songCount) {
//        this.songCount = songCount;
//    }
//
//    public void setLength(Integer length) {
//        this.length = length;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }


}