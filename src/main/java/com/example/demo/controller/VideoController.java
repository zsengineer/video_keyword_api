package com.example.demo.controller;

import com.example.demo.dto.VideoDto;
import com.example.demo.entity.Video;
import com.example.demo.repository.VideoProjection;
import com.example.demo.service.VideoService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @PostMapping()
    Video createVideo(@RequestBody VideoDto videoDto) {
        return videoService.newVideo(videoDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteVideo(@Valid @PathVariable String id) {
        return videoService.deleteVideo(Integer.parseInt(id));
    }

    @GetMapping("/list")
    ResponseEntity<List<VideoProjection>> getVideoList() {
        return videoService.getVideoList();
    }

}
