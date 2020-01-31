package com.jjdeforrest1254.songr;
import javax.persistence.*;

@Entity

public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    public String title;
    public String artist;
    public int trackNumber;

    public Song() {

    }

    public Song(String title, String artist, int trackNumber, Album album) {
        this.title = title;
        this.artist = artist;
        this.trackNumber = trackNumber;
        this.album = album;
    }



    public String toString() {
        return String.format("Title of song : %s , length of song is %s seconds and track number is : %d", title, artist, trackNumber);
    }
}