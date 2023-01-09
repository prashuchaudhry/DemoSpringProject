package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Songs;

import java.util.List;

public interface SongService {
     List<Songs> getSongsDetails();
     List<Songs>  getSongsBySingerName(String name);
    Songs getSongBySongID(int id);
    Songs addNewSong(Songs song);
    Songs updateSongDetails(Songs song);
    void deleteSong(int id);

}
