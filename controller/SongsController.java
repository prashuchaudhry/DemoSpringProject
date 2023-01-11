package com.singersAndSongs.singersAndSongs.controller;

import com.singersAndSongs.singersAndSongs.entities.Songs;
import com.singersAndSongs.singersAndSongs.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SongsController {
    @Autowired
    private SongService songService;
    @GetMapping("/songs")
    public List<Songs> getSongsDetails(){
        return this.songService.getSongsDetails();
    }

    @GetMapping("/songs/song-id/{id}")
    public Songs getSongBySongID( @PathVariable long id){
        return this.songService.getSongBySongID(id);
    }
    @GetMapping("/songs/singer-name/{name}")
    public List<Songs> getSongsBySingerName(@PathVariable String name){
        return this.songService.getSongsBySingerName(name);
    }
    @GetMapping("songs/song-prefix/{prefix}")
    public List<Songs> songsWithSamePrefix(@PathVariable String prefix){
        return this.songService.songsWtihSamePrefix(prefix);
    }
    @PostMapping("/songs")
    public Songs addNewSong(@RequestBody Songs song){
        return this.songService.addNewSong(song);
    }
    @DeleteMapping("/songs/delete-song/{id}")
    public void deleteSong(@PathVariable long id){
        this.songService.deleteSong(id);
    }
}
