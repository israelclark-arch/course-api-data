package io.sedettechnologies.courseapidata.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("love","Love story", "Israel Clark is in love with Jemimah Moses"),
			new Topic("hate","Hate story", "The hate you give little infants fucks everybody"),
			new Topic("religion","Christ is king", "The whole whole must bow at the sound of the name of Jesus")

			));
	
	public List getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll()
		.forEach(topics::add);
		
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
		
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		return;
	}
	
	
}
