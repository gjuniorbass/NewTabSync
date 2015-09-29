package com.example.gjunior.newtabsync;

/**
 * Created by gjuni on 20/09/2015.
 */
public class song {
    private long id;
    private String title;
    private String artist;
    public song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }
    public long getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
}
