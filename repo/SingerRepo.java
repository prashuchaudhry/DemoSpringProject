package com.singersAndSongs.singersAndSongs.repo;

import com.singersAndSongs.singersAndSongs.entities.Singers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SingerRepo {
    private HashMap<Long, Singers> map;

    public SingerRepo() {
        map = new HashMap<>();
        map.put(10003L, new Singers(10003, "Singer 1", "Genre 1", "Singer 1 Nick Name", 30));
        map.put(10004L, new Singers(10004, "Singer 2", "Genre 2", "Singer 2 Nick Name", 39));
    }
    public List<Singers> getList() {
        List<Singers> temp = new ArrayList<>();
        for(Map.Entry<Long, Singers> entry : map.entrySet()){
            temp.add(entry.getValue());
        }
        return temp;
    }
    public Singers getSingerDetails(long id) {
        if(map.containsKey(id))
            return map.get(id);

        return null;
    }

    public Singers createNewSinger(Singers singer) {
        map.put(singer.getSingerID(), singer);
        return singer;
    }
    public Singers updateSinger(Singers singer) {
        map.put(singer.getSingerID(), singer);
        return singer;
        }
    public void deleteSinger(long id) {
        map.remove(id);
    }
}
