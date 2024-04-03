package com.planbtech.prostudy.controllers;

import com.planbtech.prostudy.DTO.VideoDTO;
import com.planbtech.prostudy.services.interfaces.IVideoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
@CrossOrigin(origins = "http://localhost:4200")
public class VideoController {

    @Autowired
    private IVideoServices iVideoServices;

    @GetMapping("/{id}")
    public ResponseEntity<VideoDTO> findById(@PathVariable String id){
        System.out.println("testde "+ iVideoServices.findById(id).getVideoId() + " - " + iVideoServices.findById(id).getVideoTitle());;
        return ResponseEntity.ok(new VideoDTO(iVideoServices.findById(id)));
    }
}
