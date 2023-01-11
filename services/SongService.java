package com.singersAndSongs.singersAndSongs.services;

import com.singersAndSongs.singersAndSongs.entities.Songs;

import java.util.List;

public interface SongService {
     List<Songs> getSongsDetails();
     List<Songs>  getSongsBySingerName(String name);
    Songs getSongBySongID(long id);
    Songs addNewSong(Songs song);
    Songs updateSongDetails(Songs song);
    void deleteSong(long id);

    List<Songs> songsWtihSamePrefix(String prefix);

}
