package com.jjdeforrest1254.songr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    Album testAlbum;

    @BeforeEach
    public void setUp() throws Exception {
        testAlbum = new Album("TestName", "TestArtist", 1, 11, "example.com");
    }

    @Test
    public void getTitle() {
        assertEquals("TestName", testAlbum.getTitle());
    }

    @Test
    public void getArtist() {
        assertEquals("TestArtist", testAlbum.getArtist());
    }

    @Test
    public void getlength(){
        assertEquals(11,testAlbum.getLength());
    }

    @Test
    public void getSongCount() {
        assertEquals(1, testAlbum.getSongCount());
    }

    @Test
    public void getImageUrl() {
        assertEquals("example.com", testAlbum.getImageUrl());
    }

}

