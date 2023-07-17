package com.example.demo.service;

import com.example.demo.constants.Constants;
import com.example.demo.dto.VideoDto;
import com.example.demo.entity.Video;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.repository.VideoProjection;
import com.example.demo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Video newVideo(VideoDto videoDto) {

        Video video = new Video();

        video.setDatastream_id(videoDto.getDatastream_id());
        video.setRulename(videoDto.getRulename());
        video.setRuleurl(videoDto.getRuleurl());
        video.setType(videoDto.getType());

        video.setVideoid(videoDto.getVideoid());
        video.setChannelid(videoDto.getChannelid());
        video.setLaststart(videoDto.getLaststart());
        video.setRequestdate(videoDto.getRequestdate());
        video.setLocked(videoDto.getLocked());
        video.setHbaseindex(videoDto.getHbaseindex());
        video.setPlaylistid(videoDto.getPlaylistid());
        video.setRecheckhours(videoDto.getRecheckhours());
        video.setRuleexpiration(videoDto.getRuleexpiration());
        video.setGuidvalue(videoDto.getGuidvalue());
        video.setVideosuploadedsince(videoDto.getVideosuploadedsince());
        video.setLaststartscheduled(videoDto.getLaststartscheduled());
        video.setIsactive(videoDto.getIsactive());
        video.setModifieddate(videoDto.getModifieddate());
        video.setDatecreated(videoDto.getDatecreated());
        video.setChannelname(videoDto.getChannelname());
        video.setLastpublishedvideo(videoDto.getLastpublishedvideo());
        video.setLastpublishedcomment(videoDto.getLastpublishedcomment());

        return videoRepository.save(video);
    }

    public ResponseEntity<String> deleteVideo(Integer videoId){


        Optional<Video> faq = videoRepository.findById(videoId);

        if(faq.isEmpty()){
            throw new DataNotFoundException("Video is not found");
        }

        videoRepository.deleteById(videoId);

        return ResponseEntity.status(HttpStatus.OK).body(Constants.SUCCESSFULLY_DELETED);

    }

    public ResponseEntity<List<VideoProjection>> getVideoList(){


        List<VideoProjection> list = videoRepository.getAllVideoProjections();



        return ResponseEntity.status(HttpStatus.OK).body(list);

    }
}
