package classroom.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;



import java.util.HashSet;
import java.util.Set;

import lombok.Data;


@Data
@NoArgsConstructor
public abstract class ContributorData {
	private Long contributorId;
	private String contributorName;
	private String contributorEmail;
	private Set <ClassroomResponse>  classrooms =  new HashSet<>();
	
	
	public ContributorData(Contributor save) {
	   contributorId = Contributor.getContributororId();	
	   contributorName = Contributor.getContributorName();
	   contributorEmail = Contributor.getContributorEmail();
	   
	   
	   for(Classroom classroom : Contributor.getClassroom()) {
		   Set<ClassroomResponse> classroom1;
		classroom.add ( new ClassroomResponse((Classroom) classroom));
	   }
	}
	
	@Data
	@NoArgsConstructor
	static class PetStoreResponse {
		private Long classroomId;
		private String className;
	    private GeoLocation geoLocation;
	    private Set<String> amenities = new HashSet<>();
	    
	

 public void deleteClassroomById() {
}  
	 
 
 void delete() {
}

public Object getContributorName() {
	// TODO Auto-generated method stub
	return null;
}

public Object getContributorEmail() {
	// TODO Auto-generated method stub
	return null;
 }



public Long getContributorId() {
	return null;
}
}

public Object getContributorName() {
	// TODO Auto-generated method stub
	return null;
}
}