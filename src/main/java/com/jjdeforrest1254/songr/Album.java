package com.jjdeforrest1254.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    String title;
    String artist;
    Integer songCount;
    Integer length;
    String imageUrl;

    public Album(String title, String artist, Integer songCount, Integer length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Album() {

    }

    public String toString() {
        return String.format("title: %s artist is : %s amount of songs: %d length is : %d", this.title, this.artist, this.songCount, this.length);
    }

    public String getTitle() {
        return title;
    }


    public String getArtist() {
        return artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public Integer getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}