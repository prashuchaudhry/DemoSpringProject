package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Singers;

import java.util.List;
// we're using interfaces for the purpose of loose coupling
public interface SingerService {
    public List<Singers> getSingersDetails();

    Singers getSingerDetails(long singerID);

    Singers createNewSinger(Singers singer);

    Singers updateSinger(Singers singer);

    void deleteSinger(long id);
}
