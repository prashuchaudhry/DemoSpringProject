package com.singersAndSongs.singersAndSongs.controller;

//import org.springframework.stereotype.Controller;
import com.singersAndSongs.singersAndSongs.entities.*;
import com.singersAndSongs.singersAndSongs.services.*;
//import com.singersAndSongs.singersAndSongs.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
//controller class for the control layer of my application
// writing annotation @controller to tell the springboot that this is a controller class
@RestController
// rest = representational state transfer
public class SingerController {
    @Autowired // this will create an object of the singer services class and inject it here.
    private SingerService singerService;

 
    @GetMapping("/singers")
    //this method will give the details of all the singers
    public List<Singers> getSingersDetails(){
       return this.singerService.getSingersDetails();
    }

    @GetMapping("/singers/singer-id/{id}")
    //this method will give the details of a specific singer
    public Singers getSingerDetails(@PathVariable long id){
       return  this.singerService.getSingerDetails(id);
    }
    @PostMapping("/singers")
    //this will be used to add another singer in the list
    public Singers createNewSinger(@RequestBody Singers singer){
       return this.singerService.createNewSinger(singer);
    }
    @PutMapping("/singers/update-singer/{name}")
    //this will update the content of our object
    public Singers updateSinger(@RequestBody Singers name){
       return this.singerService.updateSinger(name);
    }
    @DeleteMapping("/singers/delete-singer/{id}")
    //to delete a singer
    public ResponseEntity<HttpStatus> deleteSinger(@PathVariable String id){
       try{
           this.singerService.deleteSinger(Long.parseLong(id));
           return new ResponseEntity<>(HttpStatus.OK);
       }
       catch(Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
