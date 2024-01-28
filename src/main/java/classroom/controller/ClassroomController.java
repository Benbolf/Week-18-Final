package classroom.controller;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import classroom.entity.ContributorData;
import classroom.service.ClassService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/classroom")
@Slf4j
public class ClassroomController {
	@SuppressWarnings("unused")
	@Autowired
	private ClassService classroomService;
	
	@PostMapping("/contributor")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClassroomData insertClassroom (
			@RequestBody ClassroomData contributorData) {
		Log.info("Creating classroom {}", contributorData);
		Object classroomData;
		return ClassService.saveClassroom(classroomData);
	}
}


