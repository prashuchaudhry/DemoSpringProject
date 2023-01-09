package com.singersAndSongs.singersAndSongs.entities;

public class Songs {
    private int songID;
    private String songName;
    private String singers;

    public Songs(int songID, String songName, String singers) {
        this.songID = songID;
        this.songName = songName;
        this.singers = singers;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingers() {
        return singers;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }
    @Override
    public String toString() {
        return "Songs{" +
                "songID=" + songID +
                ", songName='" + songName + '\'' +
                ", singers='" + singers + '\'' +
                '}';
    }

}
