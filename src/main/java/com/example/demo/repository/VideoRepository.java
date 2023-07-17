package com.example.demo.repository;

import com.example.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    @Query("SELECT v.videoid AS videoid, v.ruleurl AS ruleurl, v.rulename AS rulename, v.datecreated as datecreated, v.modifieddate as datemodified FROM Video v")
    List<VideoProjection> getAllVideoProjections();
}
