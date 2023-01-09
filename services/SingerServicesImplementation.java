package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Singers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SingerServicesImplementation implements SingerServices{
    List<Singers> list;

    public SingerServicesImplementation(){
        // in this method we'll enter the data in the list for our singer
        list = new ArrayList<>();
        list.add(new Singers( 10001, "Shawan Mendes", "Pop", "Shawan", 26));
        list.add(new Singers(10002, "Justin Bieber", "Pop", "JB", 27));
    }
    @Override
    public List<Singers> getSingersDetails() {
        return list;
    }

    @Override
    public Singers getSingerDetails(long id) {
        Singers singer = null;
        for( Singers s : list)
            if(s.getSingerID() == id)
                return s;
        return singer;
    }

    @Override
    public Singers createNewSinger(Singers singer) {
        list.add(singer); // adding the new singer to the list
        return singer; // returning the new singer added with all his/her details
    }

    @Override
    //note : dont use update method to change the singer id
    public Singers updateSinger(Singers singer) {
        for( Singers temp : list){
            if(singer.getSingerID() == temp.getSingerID()){
//                x.setSingerID(singer.getSingerID());
                singer.setSingerName(temp.getSingerName());
                singer.setSingerGenre(temp.getSingerGenre());
                singer.setAge(temp.getAge());
                break;
            }
        }
        return singer;
    }

    @Override
    public void deleteSinger(long id) {
        list =this.list.stream().filter(singer->singer.getSingerID()!=id).collect(Collectors.toList());
    }
}
