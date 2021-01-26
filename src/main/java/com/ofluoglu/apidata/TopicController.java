package com.ofluoglu.apidata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {



    @Autowired
    private TopicService topicService;


    @RequestMapping("/uploadLists")
    public List<Topic> gelAllTopics() {
        return topicService.gelAllTopics();


    }

    @RequestMapping("/uploadLists/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/uploadLists")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/uploadLists/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/uploadLists/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }


}
