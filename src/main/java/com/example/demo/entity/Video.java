package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="datastream_id")
    private Long datastream_id;

    @Column(name="rulename", length = 255)
    private String rulename;

    @Column(name="ruleurl", length = 255)
    private String ruleurl;

    @Column(name="videoid", length = 50)
    private String videoid;

    private Integer type;

    private Integer laststart;

    private Integer requestdate;

    private Integer locked;

    @Column(name="hbaseindex", length = 50)
    private String hbaseindex;

    @Column(name="playlistid", length = 50)
    private String playlistid;

    private Integer recheckhours;

    private Timestamp ruleexpiration;

    private String guidvalue;

    private Timestamp videosuploadedsince;

    private Integer laststartscheduled;

    private Integer isactive;

    private Timestamp modifieddate;

    private Timestamp datecreated;

    @Column(name="channelid", length = 255)
    private String channelid;

    @Column(name="channelname", length = 255)
    private String channelname;

    private Integer lastpublishedvideo;

    private Integer lastpublishedcomment;


}
