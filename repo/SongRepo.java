package com.singersAndSongs.singersAndSongs.repo;

import com.singersAndSongs.singersAndSongs.entities.Songs;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SongRepo {
    private List<Songs> list;
    private HashMap<Long, Songs> map;

    public SongRepo(){
        map = new HashMap<>();
        map.put(1L, new Songs(1, "Song 1", "Singer 1"));
        map.put(2L, new Songs(2, "Song 2", "Singer 2"));
    }
    public List<Songs> getList() {
       List<Songs> list = new ArrayList<>();
       for(Map.Entry<Long, Songs>  entry: map.entrySet()){
           list.add(entry.getValue());
       }
       return list;
    }

    public List<Songs> songsBySingerName(String name) {
        List<Songs> songs = new ArrayList<>();
        for(Map.Entry<Long, Songs> entry : map.entrySet()){
            Songs song = entry.getValue();
            String singers = song.getSingers();
            if(singers.contains(name)){
                songs.add(song);
            }
        }
        return songs;
    }
    public Songs songBySongID(long id) {
        Songs song = map.get(id);
        return song;
    }
    public Songs addSong(Songs song) {
        map.put(song.getSongID(), song);
        return song;
    }
    public Songs updateSong(Songs song) {
        map.put(song.getSongID(), song);
        return song;
    }

    public void deleteSong(long id) {
        map.remove(id);
        System.out.println("This songs with id " + id + " has been deleted");
    }
    public List<Songs> commonPrefix(String prefix) {
        List<Songs> songs = new ArrayList<>();
        for(Map.Entry<Long, Songs> entry : map.entrySet()){
            Songs song = entry.getValue();
            String name = song.getSongName();
            String temp [] = name.split(" ");
            if(temp[0].equals(prefix))
                songs.add(song);
        }
        return songs;

    }
}
