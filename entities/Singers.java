package com.singersAndSongs.singersAndSongs.entities;

public class Singers {
    private long singerID;
    private String singerName;
    private String singerGenre;
    private String nickName;
    private int age;
//Constructor #!
    public Singers(long singerID, String singerName, String singerGenre, String nickName, int age) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerGenre = singerGenre;
        this.nickName = nickName;
        this.age = age;
    }
// constructor #2 -> default constructor
    public Singers() {
        super();
    }

    @Override
    public String toString() {
        return "Singers{" +
                "singerID=" + singerID +
                ", singerName='" + singerName + '\'' +
                ", singerGenre='" + singerGenre + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }

    // getter and setters
    public void setSingerID(long singerID) {
        this.singerID = singerID;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerGenre(String singerGenre) {
        this.singerGenre = singerGenre;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSingerID() {
        return singerID;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerGenre() {
        return singerGenre;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }
}
