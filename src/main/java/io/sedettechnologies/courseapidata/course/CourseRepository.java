package io.sedettechnologies.courseapidata.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

//	methods strictly following the default naming convention of the inbuilt crud repository methods 
//	will be implemented for us
	public List<Course> findByTopicId(String topicId);
	
}
