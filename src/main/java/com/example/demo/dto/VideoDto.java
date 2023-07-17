package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class VideoDto {

    private Long datastream_id;

    private String rulename;

    private String ruleurl;

    private String videoid;

    private Integer type;

    private Integer laststart;

    private Integer requestdate;

    private Integer locked;

    private String hbaseindex;

    private String playlistid;

    private Integer recheckhours;

    private Timestamp ruleexpiration;

    private String guidvalue;

    private Timestamp videosuploadedsince;

    private Integer laststartscheduled;

    private Integer isactive;

    private Timestamp modifieddate;

    private Timestamp datecreated;

    private String channelid;

    private String channelname;

    private Integer lastpublishedvideo;

    private Integer lastpublishedcomment;
}
