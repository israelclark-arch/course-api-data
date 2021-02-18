package io.sedettechnologies.springbootquickstart.courseapi.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("love","Love story", "Israel Clark is in love with Jemimah Moses"),
			new Topic("hate","Hate story", "The hate you give little infants fucks everybody"),
			new Topic("religion","Christ is king", "The whole whole must bow at the sound of the name of Jesus")

			));
	
	public List getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i <topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return;
	}
	
	
}
