package com.sample.demo.v1.timeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "v1", produces = "application/json;charset=UTF-8")
public class TimelineController {
    @Autowired
    private TimelineRepository timelineRepository;


}
