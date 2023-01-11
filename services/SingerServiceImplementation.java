package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Singers;
import com.singersAndSongs.singersAndSongs.repo.SingerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImplementation implements SingerService {
    private final SingerRepo singerObj;
    public SingerServiceImplementation(SingerRepo singer){
    this.singerObj =singer;
    }
    @Override
    public List<Singers> getSingersDetails() {
        return singerObj.getList();
    }

    @Override
    public Singers getSingerDetails(long id) {
        return singerObj.getSingerDetails(id);
    }

    @Override
    public Singers createNewSinger(Singers singer) {
        return singerObj.createNewSinger(singer);
    }

    @Override
    //note : dont use update method to change the singer id
    public Singers updateSinger(Singers singer) {
        return singerObj.updateSinger(singer);
    }

    @Override
    public void deleteSinger(long id) {
        singerObj.deleteSinger(id);
    }
}
