package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Songs;
import com.singersAndSongs.singersAndSongs.repo.SongRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongServiceImplmentation implements SongService {
    private final SongRepo songObj;
    public SongServiceImplmentation(SongRepo song){
        this.songObj = song;
    }
    @Override
    public List<Songs> getSongsDetails() {
        return songObj.getList();
    }
    @Override
    public List<Songs> getSongsBySingerName(String name) {
        return songObj.songsBySingerName(name);
    }

    @Override
    public Songs getSongBySongID(long id) {
        return songObj.songBySongID(id);
    }
    @Override
    public Songs addNewSong(Songs song) {
        return songObj.addSong(song);
    }
    @Override
    public Songs updateSongDetails(Songs song) {
        return songObj.updateSong(song);
    }
    @Override
    public void deleteSong(long id) {
        songObj.deleteSong(id);
    }
    @Override
    public List<Songs> songsWtihSamePrefix(String prefix) {
        return songObj.commonPrefix(prefix);
    }
}
