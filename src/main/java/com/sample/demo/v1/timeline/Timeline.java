package com.sample.demo.v1.timeline;

import com.sample.demo.base.BaseEntity;

import javax.persistence.*;

@Entity
public class Timeline extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tl_id")
    private Integer timeline_id;

    public void setTimeline_id(Integer timeline_id) {
        this.timeline_id = timeline_id;
    }

    public Integer getTimeline_id() {
        return timeline_id;
    }
}
