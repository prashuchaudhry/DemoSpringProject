package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Songs;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongServiceImplmentation implements SongService {
    List<Songs> list;

    public SongServiceImplmentation() {
        list = new ArrayList<>();
        list.add(new Songs(2001, "Sorry", "Justin Bieber"));
        list.add(new Songs(2002, "Senorita", "Shawn Mendes"));
    }

    @Override
    public List<Songs> getSongsDetails() {
        return list;
    }

    @Override
    public List<Songs> getSongsBySingerName(String name) {
        List<Songs> res = new ArrayList<>();
        for(Songs s : list){
            if(s.getSingers() == name){
                res.add(s);
            }
        }
        return res;
    }

    @Override
    public Songs getSongBySongID(int id) {
        Songs song =null;
        for(Songs s : list){
            if(s.getSongID() == id){
               song = s;
               break;
            }
        }
        return song;
    }

    @Override
    public Songs addNewSong(Songs song) {
        list.add(song);
        return song;
    }

    @Override
    public Songs updateSongDetails(Songs song) {
        for( Songs temp : list){
            if(temp.getSongID() == song.getSongID()){
                temp.setSongName(song.getSongName());
                temp.setSingers(song.getSingers());
                return temp;
            }
        }
        return null;
    }

    @Override
    public void deleteSong(int id) {
        for(Songs temp : list){
            if(temp.getSongID() == id){
                list.remove(temp);
                break;
            }
        }
    }
}
