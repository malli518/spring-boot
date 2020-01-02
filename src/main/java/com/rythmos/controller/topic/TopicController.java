package com.rythmos.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
		
	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<Topic> getListofTopics(){
		return topicService.getAllTopics();
	}
	@RequestMapping(method=RequestMethod.GET, value="/topics/{id1}")
	public Topic getTopic(@PathVariable(name="id1") String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updatetopics")
	public void updateTopic(@RequestBody Topic topic){
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deletetopics/{id1}")
	public void daleteTopic(@PathVariable(name="id1") String id){
		topicService.deleteTopic(id);
	}
	
	


}
