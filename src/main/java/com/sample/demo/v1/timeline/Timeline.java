package com.sample.demo.v1.timeline;

import javax.persistence.*;

@Entity
public class Timeline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tl_id")
    private Integer timeline_id;
}
